package com.example.tnash.sharedinstance;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
        private TextView FirstName, MiddleName, LastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        FirstName = findViewById(R.id.FirstName);
        MiddleName = findViewById(R.id.MiddleName);
        LastName = findViewById(R.id.LastName);

        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");

        SharedPreferences sharedPreferences = getSharedPreferences("sp", Context.MODE_PRIVATE);
       String etFirstName = sharedPreferences.getString("etFirstName", "");
       String etMiddleName = sharedPreferences.getString("etMiddleName", "");
       String etLastName = sharedPreferences.getString("etLastName", "");
       FirstName.setText (etFirstName);
       MiddleName.setText (etMiddleName);
       LastName.setText(etLastName);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}

