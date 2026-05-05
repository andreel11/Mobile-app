package com.mirea.elizarov.systemintentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonCall;
    private Button buttonBrowser;
    private Button buttonMaps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCall = findViewById(R.id.buttonCall);
        buttonBrowser = findViewById(R.id.buttonBrowser);
        buttonMaps = findViewById(R.id.buttonMaps);

        buttonCall.setOnClickListener(v -> onClickCall());
        buttonBrowser.setOnClickListener(v -> onClickOpenBrowser());
        buttonMaps.setOnClickListener(v -> onClickOpenMaps());
    }

    private void onClickCall() {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:77777777"));
        startActivity(intent);
    }

    private void onClickOpenBrowser() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://developer.android.com"));
        startActivity(intent);
    }

    private void onClickOpenMaps() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:77.77777,77.7777"));
        startActivity(intent);
    }
}