package com.hgk.assignmenttwoq4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText firstName;
    EditText middleName;
    EditText lastName;
    EditText birthDate;
    EditText address;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        middleName = findViewById(R.id.middleName);
        lastName = findViewById(R.id.lastName);
        birthDate = findViewById(R.id.birthDate);
        address = findViewById(R.id.address);
        submit = findViewById(R.id.submit);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String fName = firstName.getText().toString();
                String mName = middleName.getText().toString();
                String lName = lastName.getText().toString();
                String bDate = birthDate.getText().toString();
                String add = address.getText().toString();
                Log.d(fName,"");
                Log.d(mName,"");
                Log.d(lName,"");
                Log.d(bDate,"");
                Log.d(add,"");

                Intent intent = new Intent(getApplicationContext(),StudentDetails.class);

                intent.putExtra("firstName",fName);
                intent.putExtra("middleName",mName);
                intent.putExtra("lastName",lName);
                intent.putExtra("birthDate",bDate);
                intent.putExtra("address",add);

                startActivity(intent);
            }
        });
    }
}