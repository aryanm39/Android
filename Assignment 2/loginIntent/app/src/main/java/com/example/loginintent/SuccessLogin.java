package com.example.loginintent;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SuccessLogin extends Activity {
    TextView sText;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        sText = findViewById(R.id.sText);

        String userName = getIntent().getStringExtra("username");

        sText.setText("Login Success for User : " + userName);
    }
}
