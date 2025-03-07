package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText display;
    private String currentInput = "";
    private String operator = "";
    private double firstOperand = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);

        // Number Buttons
        int[] numberIds = {R.id.btn_0, R.id.btn_1, R.id.btn_2, R.id.btn_3, R.id.btn_4,
                R.id.btn_5, R.id.btn_6, R.id.btn_7, R.id.btn_8, R.id.btn_9, R.id.btn_dot};
        View.OnClickListener numberClickListener = view -> {
            Button button = (Button) view;
            currentInput += button.getText().toString();
            display.setText(currentInput);
        };
        for (int id : numberIds) {
            findViewById(id).setOnClickListener(numberClickListener);
        }

        // Operator Buttons
        int[] operatorIds = {R.id.btn_add, R.id.btn_sub, R.id.btn_mul, R.id.btn_div};
        View.OnClickListener operatorClickListener = view -> {
            Button button = (Button) view;
            if (!currentInput.isEmpty()) {
                firstOperand = Double.parseDouble(currentInput);
                operator = button.getText().toString();
                currentInput = "";
                display.setText(operator);
            }
        };
        for (int id : operatorIds) {
            findViewById(id).setOnClickListener(operatorClickListener);
        }

        // Clear Button
        findViewById(R.id.btn_clear).setOnClickListener(view -> {
            currentInput = "";
            operator = "";
            firstOperand = 0;
            display.setText("");
        });

        // Equal Button
        findViewById(R.id.btn_equal).setOnClickListener(view -> {
            if (!currentInput.isEmpty() && !operator.isEmpty()) {
                double secondOperand = Double.parseDouble(currentInput);
                double result = 0;

                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        if (secondOperand != 0) {
                            result = firstOperand / secondOperand;
                        } else {
                            display.setText("Error");
                            return;
                        }
                        break;
                }

                display.setText(String.valueOf(result));
                currentInput = "";
                operator = "";
                firstOperand = 0;
            }
        });
    }
}
