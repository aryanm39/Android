package com.hgk.palendrome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText editText;
    TextView errMsg;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.userString);
        button = findViewById(R.id.submit);
        errMsg = findViewById(R.id.errMsg);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    int numberOne = Integer.parseInt(editText.getText().toString());
                    int temp = numberOne;
                    int result = 0;
                    Log.d("numberOne","" + numberOne);
                    while(temp > 0)
                    {
                        int numberTwo = temp % 10;
                        result = (result * 10) + numberTwo;
                        temp = temp / 10;
                    }

                    if(result == numberOne)
                    {
                        Intent intent = new Intent(getApplicationContext(),Success.class);
                        intent.putExtra("userNumber",numberOne);
                        intent.putExtra("isPal",1);

                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent = new Intent(getApplicationContext(),Success.class);
                        intent.putExtra("userNumber",numberOne);
                        intent.putExtra("isPal",0);

                        startActivity(intent);
                    }
                }
                catch (NumberFormatException e1)
                {
                    errMsg.setText("ENTER VALID NUMBER !!!");
                }


            }
        });

    }
}