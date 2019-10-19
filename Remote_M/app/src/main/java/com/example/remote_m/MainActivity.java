package com.example.remote_m;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            String token = FirebaseInstanceId.getInstance().getToken();
            Log.d("IDService","device token : "+token);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
