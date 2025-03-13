package com.hgk.assignmentfourq4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberEditText;
    RadioGroup radioGroup;
    Button button;
    RadioButton oddEven;
    RadioButton positiveNegative;
    RadioButton square;
    RadioButton factorial;
    TextView textView;
    String result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEditText = findViewById(R.id.number);
        radioGroup = findViewById(R.id.radioGrp);
        button = findViewById(R.id.submit);
        oddEven = findViewById(R.id.oddEven);
        positiveNegative = findViewById(R.id.positiveNegative);
        square = findViewById(R.id.square);
        factorial = findViewById(R.id.factorial);
        textView = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(result);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(oddEven.isChecked())
                {
                    try {
                        int number = Integer.parseInt(numberEditText.getText().toString());

                        if(number % 2 == 0)
                        {
                            result = number + " IS EVEN";
                        }
                        else
                        {
                            result = number + " IS ODD";
                        }

                    }
                    catch (Exception e)
                    {
                        result = "ENTER THE NUMBER";
                    }

                }
                else if(positiveNegative.isChecked())
                {
                    try {

                        int number = Integer.parseInt(numberEditText.getText().toString());

                        if (number > 0) {
                            result = "NUMBER IS POSITIVE";
                        } else {
                            result = "NUMBER IS NEGATIVE";
                        }
                    }
                    catch (Exception e)
                    {
                        result = "ENTER THE NUMBER";
                    }

                }
                else if(square.isChecked())
                {
                    try {

                        int number = Integer.parseInt(numberEditText.getText().toString());

                        result = "SQAURE OF" + number + " IS : " + (number * number);
                    }
                    catch (Exception e)
                    {
                        result = "ENTER THE NUMBER";
                    }
                }
                else if(factorial.isChecked())
                {
                    try {

                        int number = Integer.parseInt(numberEditText.getText().toString());
                        int sum = 1;
                        for (int j = 1; j <= number; j++) {
                            sum = sum * j;
                        }

                        result = "FACTORIAL OF " + number + " IS : " + sum;
                    }
                    catch (Exception e)
                    {
                        result = "ENTER THE NUMBER";
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