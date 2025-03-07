package com.example.factorial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText numberOneEditText = null;
    Button button = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberOneEditText = findViewById(R.id.number);
        button = findViewById(R.id.cal);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    int number = Integer.parseInt(numberOneEditText.getText().toString());
                    int sum = 1;
                    for (int i = 1; i <= number; i++) {
                        sum = sum * i;
                    }

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setCancelable(true);
                    builder.setTitle("Factorial");
                    builder.setMessage("Factorial Of " + number + " is : " + sum);
                    builder.show();
                }
                catch (Exception e)
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setCancelable(true);
                    builder.setTitle("Error");
                    builder.setMessage("Enter The Number !!!");
                    builder.show();
                }

            }
        });
    }
}