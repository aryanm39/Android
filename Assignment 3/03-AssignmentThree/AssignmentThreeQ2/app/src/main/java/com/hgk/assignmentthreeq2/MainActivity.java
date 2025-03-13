package com.hgk.assignmentthreeq2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    EditText editor;

    Button numberButtons[] = new Button[10];
    Button addition,subtraction,multiplication,division,dot,clear;

    public static float numberOne = 0;
    public static float numberTwo = 0;
    public static float resultNumber = 0;
    public static String operation = null;

    Button result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberButtons[0] = findViewById(R.id.zero);
        numberButtons[1] = findViewById(R.id.one);
        numberButtons[2] = findViewById(R.id.two);
        numberButtons[3] = findViewById(R.id.three);
        numberButtons[4] = findViewById(R.id.four);
        numberButtons[5] = findViewById(R.id.five);
        numberButtons[6] = findViewById(R.id.six);
        numberButtons[7] = findViewById(R.id.seven);
        numberButtons[8] = findViewById(R.id.eight);
        numberButtons[9] = findViewById(R.id.nine);

        addition = findViewById(R.id.add);
        subtraction = findViewById(R.id.sub);
        multiplication = findViewById(R.id.mul);
        division = findViewById(R.id.div);

        dot = findViewById(R.id.dot);

        clear = findViewById(R.id.clear);

        result = findViewById(R.id.ans);

        editor = findViewById(R.id.editor);

        numberOne = 0;
        numberTwo = 0;
        resultNumber = 0;

        for(int i = 0; i < numberButtons.length;i++)
        {
            numberButtons[i].setOnClickListener(new NumberButtons(i,editor));
        }

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number = Float.parseFloat(editor.getText().toString().trim());

                if(number == null)
                {
                    number = 0.0f;
                }
                numberOne = number;
                editor.setText(null);
                NumberButtons.numberString = "";
                DotButtonListener.dotCount = 0;
                operation = "+";
                Log.d("NUM", "" + numberOne);

            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Float number = Float.parseFloat(editor.getText().toString().trim());

                if(number == null)
                {
                    number = 0.0f;
                }

                numberOne = number;
                editor.setText("");
                NumberButtons.numberString = "";
                DotButtonListener.dotCount = 0;
                operation = "-";
            }
        });

        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number = Float.parseFloat(editor.getText().toString().trim());

                if(number == null)
                {
                    number = 0.0f;
                }

                numberOne = number;
                editor.setText("");
                NumberButtons.numberString = "";
                DotButtonListener.dotCount = 0;
                operation = "*";
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number = Float.parseFloat(editor.getText().toString().trim());

                if(number == null)
                {
                    number = 0.0f;
                }
                numberOne = number;
                editor.setText("");
                NumberButtons.numberString = "";
                DotButtonListener.dotCount = 0;
                operation = "/";
            }
        });

        dot.setOnClickListener(new DotButtonListener(editor));

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.setText(null);
                NumberButtons.numberString = "";
                DotButtonListener.dotCount = 0;
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number = Float.parseFloat(editor.getText().toString().trim());

                if(number == null)
                {
                    number = 0.0f;
                }
                numberTwo = number;
                editor.setText("");
                NumberButtons.numberString = "";
                DotButtonListener.dotCount = 0;

                Float result = null;

                if(operation.equals("+")){
                    result = numberOne + numberTwo;

                    if(result == null)
                    {
                        result = 0.0f;
                    }

                    editor.setText(result.toString());
                }
                else if(operation.equals("-")){
                    result = numberOne - numberTwo;

                    if(result == null)
                    {
                        result = 0.0f;
                    }

                    editor.setText(result.toString());
                }
                else if(operation.equals("*")){
                    result = numberOne * numberTwo;

                    if(result == null)
                    {
                        result = 0.0f;
                    }

                    editor.setText(result.toString());
                }
                else if(operation.equals("/")){
                    result = numberOne / numberTwo;

                    if(result == null)
                    {
                        result = 0.0f;
                    }

                    editor.setText(result.toString());
                }
            }
        });

    }

}