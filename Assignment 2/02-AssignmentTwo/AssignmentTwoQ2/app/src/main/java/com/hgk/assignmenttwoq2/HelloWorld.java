package com.hgk.assignmenttwoq2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;


public class HelloWorld extends Activity {
    TextView textView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        textView = findViewById(R.id.textView);
        String msg = getIntent().getStringExtra("msg");
        textView.setText(msg);
    }
}
