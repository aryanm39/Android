package com.example.loginform;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    private EditText firstName, middleName, lastName, dob, address, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.editFirstName);
        middleName = findViewById(R.id.editMiddleName);
        lastName = findViewById(R.id.editLastName);
        dob = findViewById(R.id.editDOB);
        address = findViewById(R.id.editAddress);
        email = findViewById(R.id.editEmail);
    }

    public void onSubmit(View view) {
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("firstName", firstName.getText().toString());
        intent.putExtra("middleName", middleName.getText().toString());
        intent.putExtra("lastName", lastName.getText().toString());
        intent.putExtra("dob", dob.getText().toString());
        intent.putExtra("address", address.getText().toString());
        intent.putExtra("email", email.getText().toString());
        startActivity(intent);
    }
}
