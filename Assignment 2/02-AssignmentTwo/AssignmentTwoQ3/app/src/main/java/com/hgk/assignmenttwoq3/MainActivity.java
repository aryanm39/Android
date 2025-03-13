package com.hgk.assignmenttwoq3;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    EditText username;
    EditText password;
    TextView errorMsg;
    Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        errorMsg = findViewById(R.id.errorMsg);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = username.getText().toString();
                String pass = password.getText().toString();
                Log.d(userName,"");
                if(userName.equals("Hemant") && pass.equals("123"))
                {
                    Intent intentSuccess = new Intent(getApplicationContext(),SuccessLogin.class);
                    intentSuccess.putExtra("username",userName);

                    startActivity(intentSuccess);
                }
                else
                {
                    errorMsg.setText("Wrong UserName And Password !!!");
                }
            }
        });
    }
}