package com.example.intent;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickWebBrowser(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com")); // Example URL
        startActivity(i);
    }

    public void onClickMakeCalls(View view){
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8767366698")); // Example phone number
        startActivity(i);
    }

    public void onClickShowMap(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:18.5118402,73.8380975")); // Example coordinates (San Francisco)
        startActivity(i);
    }
}
