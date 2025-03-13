package com.hgk.assignemntfourq1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton = null;
    TextView bulbView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toogleButton);
        bulbView = findViewById(R.id.bulb);

        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(((ToggleButton)view).isChecked())
                {
                    bulbView.setText("BULB IS ON");
                    bulbView.setBackgroundColor(Color.YELLOW);

                }
                else
                {
                    bulbView.setText("BULB IS OFF");
                    bulbView.setBackgroundColor(Color.WHITE);
                }
            }
        });

    }
}