package com.example.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {
    String tag = "Event";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag,"In onCreate()\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag,"In onStart()\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag,"In onResume()\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag,"In onPause()\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag,"In onStop()\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag,"in onDestory()\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag,"In onRestart()\n");
    }
}