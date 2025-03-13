package com.hgk.assignmenttwoq4;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class StudentDetails extends Activity {
    TextView firstName;
    TextView middleName;
    TextView lastName;
    TextView birthDate;
    TextView address;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details);

        String fName = getIntent().getStringExtra("firstName");
        String mName = getIntent().getStringExtra("middleName");
        String lName = getIntent().getStringExtra("lastName");
        String bDate = getIntent().getStringExtra("birthDate");
        String add = getIntent().getStringExtra("address");

        firstName = findViewById(R.id.firstName);
        middleName = findViewById(R.id.middleName);
        lastName = findViewById(R.id.lastName);
        birthDate = findViewById(R.id.birthDate);
        address = findViewById(R.id.address);

        firstName.setText(String.format("FIRST NAME : %s", fName));
        middleName.setText(String.format("MIDDLE NAME : %s", mName));
        lastName.setText(String.format("LAST NAME : %s", lName));
        birthDate.setText(String.format("BIRTH DATE : %s", bDate));
        address.setText(String.format("ADDRESS : %s", add));



    }
}
