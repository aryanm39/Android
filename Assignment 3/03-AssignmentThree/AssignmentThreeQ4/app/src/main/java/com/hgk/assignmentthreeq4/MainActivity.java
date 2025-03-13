package com.hgk.assignmentthreeq4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numberOneEditText,numberTwoEditText;
    TextView errMsgTextView;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOneEditText = findViewById(R.id.numberOne);
        numberTwoEditText = findViewById(R.id.numberTwo);
        errMsgTextView = findViewById(R.id.errMsg);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                try {
                    int numberOne = Integer.parseInt(numberOneEditText.getText().toString());
                    int numberTwo = Integer.parseInt(numberTwoEditText.getText().toString());

                    if (numberOne < 10 && numberTwo < 10) {
                        Intent intent = new Intent(getApplicationContext(), Success.class);
                        intent.putExtra("numberOne", numberOne);
                        intent.putExtra("numberTwo", numberTwo);

                        startActivity(intent);
                    } else {
                        errMsgTextView.setText("Enter Numbers Less than 10 !!!");
                    }
                }catch (Exception e)
                {
                    errMsgTextView.setText("Enter Numbers !!!");
                }
            }
        });
    }
}