package com.taliano.intent_impliciti;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWEB = findViewById(R.id.buttonWEB);
        Button buttonSMS = findViewById(R.id.buttonSMS);
        Button buttonCALL = findViewById(R.id.buttonCALL);
        Button buttonEMAIL = findViewById(R.id.buttonEMAIL);

        buttonWEB.setOnClickListener(this);
        buttonSMS.setOnClickListener(this);
        buttonCALL.setOnClickListener(this);
        buttonEMAIL.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String uri = "";
        switch (v.getId()){
            case R.id.buttonWEB:
                uri = "http://www.google.com";
                break;
            case R.id.buttonSMS:
                uri = "sms:3319918947";
                break;
            case R.id.buttonCALL:
                uri = "tel:3319918947";
                break;
            case R.id.buttonEMAIL:
                uri = "mailto:talia4343@gmail.com";
                break;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }
}
