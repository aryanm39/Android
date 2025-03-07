package com.example.loginform;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView displayInfo = findViewById(R.id.textViewDisplay);

        String firstName = getIntent().getStringExtra("firstName");
        String middleName = getIntent().getStringExtra("middleName");
        String lastName = getIntent().getStringExtra("lastName");
        String dob = getIntent().getStringExtra("dob");
        String address = getIntent().getStringExtra("address");
        String email = getIntent().getStringExtra("email");

        String info = "Student Information:\n\n" +
                "Name: " + firstName + " " + middleName + " " + lastName + "\n" +
                "DOB: " + dob + "\n" +
                "Address: " + address + "\n" +
                "Email: " + email;

        displayInfo.setText(info);
    }
}
