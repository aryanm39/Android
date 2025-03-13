package com.hgk.assignmentfourq2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.number);
        textView = findViewById(R.id.msg);

        button.setOnCreateContextMenuListener(this);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,0,0,"Factorial");
        menu.add(0,1,1,"SumOfDigits");

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return menuChoice(item);
    }

    private boolean menuChoice(MenuItem item)
    {
        switch (item.getItemId())
        {
            case 0:
                try {
                    textView.setText("Factorial is : " +  factorial(Integer.parseInt(editText.getText().toString())));
                    textView.setTextColor(Color.BLACK);
                }
                catch (Exception e)
                {
                    textView.setText("ENTER THE NUMBER !!!");
                    textView.setTextColor(Color.RED);
                }
                return true;

            case 1:
                try {
                    textView.setText("DIGIT SUM IS : " + digitSum(Integer.parseInt(editText.getText().toString())));
                    textView.setTextColor(Color.BLACK);
                }
                catch (Exception e)
                {
                    textView.setText("ENTER THE NUMBER !!!");
                    textView.setTextColor(Color.RED);
                }
                return true;

            default:
                return false;

        }
    }

    private int factorial(int number)
    {
        int sum = 1;

        for(int i = 1;i <= number; i++)
        {
            sum = sum * i;
        }

        return sum;
    }

    private int digitSum(int number)
    {
        int sum = 0;

        while (number > 0)
        {
            int reminder = number % 10;
            sum = sum + reminder;
            number = number / 10;
        }

        return sum;
    }


}