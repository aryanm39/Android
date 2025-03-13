package com.hgk.assignmentfourq3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,0,0,"Add");
        menu.add(0,1,1,"DELETE");
        menu.add(0,2,2,"EDIT");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case 0:
                Toast.makeText(this, "Add option Selected", Toast.LENGTH_SHORT).show();
                return true;

            case 1:
                Toast.makeText(this, "Delete option Selected", Toast.LENGTH_SHORT).show();
                return true;

            case 2:
                Toast.makeText(this, "Edit option Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return false;
        }
    }
}