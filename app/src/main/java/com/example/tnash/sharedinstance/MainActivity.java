package com.example.tnash.sharedinstance;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private static final String TAG = "MainActivity";
        private EditText etFirstName, etMiddleName, etLastName;

        Button btnNext;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            //binding views
            etFirstName = (EditText) findViewById(R.id.etFirstName);
            etMiddleName = (EditText) findViewById(R.id.etMiddleName);
            etLastName = (EditText) findViewById(R.id.etLastName);
            Log.d(TAG, "onCreate: ");

            btnNext = (Button) findViewById(R.id.btnNext);
            btnNext.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    String name = etFirstName.getText().toString();
                    String midname = etMiddleName.getText().toString();
                    String lstname = etLastName.getText().toString();
                }
            });
        }

        private void showToast(String toast) {
            Toast.makeText(MainActivity.this, toast, Toast.LENGTH_SHORT).show();
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


    public void doSomething(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences ( "sp", MODE_PRIVATE );
        SharedPreferences.Editor editor = sharedPreferences.edit ();
        editor.putString ( "etFirstName" , etFirstName.getText ().toString () );
        editor.putString ( "etMiddleName" , etMiddleName.getText ().toString () );
        editor.putString ( "etLastName" , etLastName.getText ().toString () );
        editor.commit ();
        Intent intent1 = new Intent ( this , SecondActivity.class );
        startActivity ( intent1 );

    }
}

