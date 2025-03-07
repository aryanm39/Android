package com.example.palindrome;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNumber = findViewById(R.id.editTextNumber);
        Button buttonCheck = findViewById(R.id.buttonCheck);
        TextView textViewResult = findViewById(R.id.textViewResult);

        buttonCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberInput = editTextNumber.getText().toString();

                // Validate input
                if (TextUtils.isEmpty(numberInput)) {
                    textViewResult.setText("Please enter a number!");
                    return;
                }

                // Check if the number is a palindrome
                int number = Integer.parseInt(numberInput);
                if (isPalindrome(number)) {
                    textViewResult.setText("The number " + number + " is a palindrome!");
                } else {
                    textViewResult.setText("The number " + number + " is not a palindrome.");
                }
            }
        });
    }

    // Helper method to check if a number is a palindrome
    private boolean isPalindrome(int number) {
        int original = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}
