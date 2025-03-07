package com.example.additionintent;
import android.os.Bundle;

public class New extends Activity {
    TextView tv1;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.t1);
        String ans = getIntent().getStringExtra("uname");
        tv1.setText("Welcome "+ans);
    }
}
