package com.hgk.palendrome;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Success extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.palendrome);
        textView = findViewById(R.id.success);

        int number = getIntent().getIntExtra("userNumber",0);
        int isPal = getIntent().getIntExtra("isPal",0);

        if(isPal == 1)
        {
            textView.setText(number + " IS Palendrome");
        }
        else
        {
            textView.setText(number + " IS NOT Palendrome");
        }

    }
}
