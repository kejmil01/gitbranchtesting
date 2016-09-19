package com.example.dell.branchtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Test1", Toast.LENGTH_SHORT).show();
		Toast.makeText(this, "Test2", Toast.LENGTH_SHORT).show();
		Toast.makeText(this, "Test333", Toast.LENGTH_SHORT).show();
    }
}
