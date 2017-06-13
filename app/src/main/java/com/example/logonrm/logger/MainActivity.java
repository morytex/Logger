package com.example.logonrm.logger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick({
        R.id.btStart,
        R.id.btStop
    })
    public void onClick(View view) {
        Intent intent = new Intent(this, Logger.class);

        if (view.getId() == R.id.btStart) {
            startService(intent);
        } else {
            stopService(intent);
        }
    }
}
