package com.example.stringoperation;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText stringEditText;
    RadioGroup radioGroup;
    Button button;
    RadioButton upper;
    RadioButton lower;
    RadioButton right;
    RadioButton left;
    TextView textView;
    String result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringEditText = findViewById(R.id.string);
        radioGroup = findViewById(R.id.radioGrp);
        button = findViewById(R.id.submit);
        textView = findViewById(R.id.result);
        upper = findViewById(R.id.upper);
        lower = findViewById(R.id.lower);
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result != null)
                    textView.setText(result);
                else
                    textView.setText("RESULT IS NULL");
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(upper.isChecked())
                {
                    result = "";
                    String str = stringEditText.getText().toString();
                    Log.d("STR",str);
                    result = str.toUpperCase();

                }
                else if(lower.isChecked())
                {
                    result = "";
                    result = stringEditText.getText().toString().toLowerCase();
                }
                else if(right.isChecked())
                {

                    String string = stringEditText.getText().toString();
                    result = "";
                    if(string.length() > 5)
                    {
                        for(int j = string.length() - 5; j < string.length();j++)
                        {
                            result = result + string.charAt(j);
                        }
                    }
                    else
                    {
                        result = "STRING LENGTH IS LESS THAN 5";
                    }
                }
                else if(left.isChecked())
                {
                    result = "";
                    String string = stringEditText.getText().toString();

                    if(string.length() > 5)
                    {
                        for(int j = 0; j < 5; j++)
                        {
                            result = result + string.charAt(j);
                        }
                    }
                    else
                    {
                        result = "STRING LENGTH IS LESS THAN 5";
                    }
                }
                else
                {
                    result = "PLS SELECT OPTION";
                }
            }
        });
    }
}