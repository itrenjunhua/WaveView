package com.waveview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.waveview.activity.CircleActivity;
import com.waveview.activity.RectActivity;

public class MainActivity extends AppCompatActivity {
    private Button btCircle;
    private Button btRect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btRect = (Button) findViewById(R.id.bt_rect);
        btCircle = (Button) findViewById(R.id.bt_circle);

        btRect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RectActivity.class);
                startActivity(intent);
            }
        });

        btCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CircleActivity.class);
                startActivity(intent);
            }
        });
    }
}
