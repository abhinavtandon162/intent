package com.example.abc.intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ABC on 19-06-2017.
 */

class OtherActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        String dataReceived = getIntent().getStringExtra("data");
               int result = getIntent().getIntExtra("result", 0);
        ((TextView) findViewById(R.id.tv_other)).setText(dataReceived);


    }
}
