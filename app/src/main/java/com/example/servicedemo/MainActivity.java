package com.example.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnstart_Service_onClick(View view) {

        startActivity(new Intent(getBaseContext(),MyService2.class));
        Toast.makeText(this, "Service Start", Toast.LENGTH_SHORT).show();


    }

    public void btnstop_Service_onClick(View view) {

        stopService(new Intent(getBaseContext(),MyService2.class));
        Toast.makeText(this, "Service Stopped", Toast.LENGTH_SHORT).show();
    }
}
