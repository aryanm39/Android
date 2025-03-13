package com.hgk.assignmentthreeq4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Success extends AppCompatActivity {
    TextView msgTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        msgTextView = findViewById(R.id.msg);

        int numberOne = getIntent().getIntExtra("numberOne",0);
        int numberTwo = getIntent().getIntExtra("numberTwo",0);

        msgTextView.setText("First Number Is : " + numberOne + "\nSecond Number Is : " + numberTwo);
    }

}
