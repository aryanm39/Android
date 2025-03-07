package com.example.numbers;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText num1Input, num2Input;
    private TextView resultDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize UI components
        num1Input = findViewById(R.id.num1_input);
        num2Input = findViewById(R.id.num2_input);
        Button submitButton = findViewById(R.id.submit_button);
        resultDisplay = findViewById(R.id.result_display);

        // Set onClickListener for Submit button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleInput();
            }
        });
    }

    private void handleInput() {
        // Retrieve user input
        String num1Str = num1Input.getText().toString();
        String num2Str = num2Input.getText().toString();

        // Validate input
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        // Check condition
        if (num1 > 10 && num2 > 10) {
            Toast.makeText(this, "Both numbers are greater than 10. Enter new numbers.", Toast.LENGTH_SHORT).show();
            // Clear inputs
            num1Input.setText("");
            num2Input.setText("");
        } else {
            // Display numbers
            String result = "First Number: " + num1 + "\nSecond Number: " + num2;
            resultDisplay.setText(result);
        }
    }
}
