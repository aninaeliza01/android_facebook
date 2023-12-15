package com.example.android_facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void like(View view) {
        Toast.makeText(MainActivity.this,"Liked",Toast.LENGTH_LONG).show();
    }

    public void comment(View view) {
        Toast.makeText(MainActivity.this,"Commented",Toast.LENGTH_LONG).show();

    }

    public void share(View view) {
        Toast.makeText(MainActivity.this,"Shared",Toast.LENGTH_LONG).show();

    }
}