package ivandgetic.hexconversion;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    EditText before_conversion, after_conversion;
    RadioButton Before_Binary, Before_Octal, Before_Decimal, Before_Hex, After_Binary, After_Octal, After_Decimal, After_Hex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        before_conversion = (EditText) findViewById(R.id.before_conversion);
        after_conversion = (EditText) findViewById(R.id.after_conversion);
        Before_Binary = (RadioButton) findViewById(R.id.Before_Binary);
        Before_Octal = (RadioButton) findViewById(R.id.Before_Octal);
        Before_Decimal = (RadioButton) findViewById(R.id.Before_Decimal);
        Before_Hex = (RadioButton) findViewById(R.id.Before_Hex);
        After_Binary = (RadioButton) findViewById(R.id.After_Binary);
        After_Octal = (RadioButton) findViewById(R.id.After_Octal);
        After_Decimal = (RadioButton) findViewById(R.id.After_Decimal);
        After_Hex = (RadioButton) findViewById(R.id.After_Hex);
        String Value = before_conversion.getText().toString();
    }

    public void conversion(View view) {
        if (Before_Binary.isChecked()) {
            if (After_Binary.isChecked()) {//2转2
                after_conversion.setText(before_conversion.getText().toString());
            } else if (After_Octal.isChecked()) {//2转8
                after_conversion.setText(Integer.toOctalString(Integer.parseInt(Integer.valueOf(before_conversion.getText().toString(), 2).toString())));
            } else if (After_Decimal.isChecked()) {//2转10
                after_conversion.setText(Integer.valueOf(before_conversion.getText().toString(), 2).toString());
            } else if (After_Hex.isChecked()) {//2转16
                after_conversion.setText(Integer.toHexString(Integer.parseInt(Integer.valueOf(before_conversion.getText().toString(), 2).toString())));
            }
        }
        if (Before_Octal.isChecked()) {
            if (After_Binary.isChecked()) {//8转2
                after_conversion.setText(Integer.toBinaryString(Integer.parseInt(Integer.valueOf(before_conversion.getText().toString(), 8).toString())));
            } else if (After_Octal.isChecked()) {//8转8
                after_conversion.setText(before_conversion.getText().toString());
            } else if (After_Decimal.isChecked()) {//8转10
                after_conversion.setText(Integer.valueOf(before_conversion.getText().toString(), 8).toString());
            } else if (After_Hex.isChecked()) {//8转16
                after_conversion.setText(Integer.toHexString(Integer.parseInt(Integer.valueOf(before_conversion.getText().toString(), 8).toString())));
            }
        }
        if (Before_Decimal.isChecked()) {
            if (After_Binary.isChecked()) {//10转2
                after_conversion.setText(Integer.toBinaryString(Integer.parseInt(before_conversion.getText().toString())));
            } else if (After_Octal.isChecked()) {//10转8
                after_conversion.setText(Integer.toOctalString(Integer.parseInt(before_conversion.getText().toString())));
            } else if (After_Decimal.isChecked()) {//10转10
                after_conversion.setText(before_conversion.getText().toString());
            } else if (After_Hex.isChecked()) {//10转16
                after_conversion.setText(Integer.toHexString(Integer.parseInt(before_conversion.getText().toString())));
            }
        }
        if (Before_Hex.isChecked()) {
            if (After_Binary.isChecked()) {//16转2
                after_conversion.setText(Integer.toBinaryString(Integer.parseInt(Integer.valueOf(before_conversion.getText().toString(), 16).toString())));
            } else if (After_Octal.isChecked()) {//16转8
                after_conversion.setText(Integer.toOctalString(Integer.parseInt(Integer.valueOf(before_conversion.getText().toString(), 16).toString())));
            } else if (After_Decimal.isChecked()) {//16转10
                after_conversion.setText(Integer.valueOf(before_conversion.getText().toString(), 16).toString());
            } else if (After_Hex.isChecked()) {//16转16
                after_conversion.setText(before_conversion.getText().toString());
            }
        }
    }
}
