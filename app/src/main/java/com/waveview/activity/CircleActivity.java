package com.waveview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.waveview.R;
import com.waveview.view.WaveView;

/**
 * ======================================================================
 * <p/>
 * 作者：Renj
 * <p/>
 * 创建时间：2016-12-23    9:25
 * <p/>
 * 描述：
 * <p/>
 * 修订历史：
 * <p/>
 * ======================================================================
 */
public class CircleActivity extends Activity {
    private WaveView waveview;
    private Button btStart;
    private Button btStop;
    private Button btReset;
    private TextView tvPrecent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        tvPrecent = (TextView) findViewById(R.id.tv_precent);
        btStart = (Button) findViewById(R.id.bt_start);
        btStop = (Button) findViewById(R.id.bt_stop);
        btReset = (Button) findViewById(R.id.bt_reset);

        waveview = (WaveView) findViewById(R.id.waveview);

        waveview.setPrecentChangeListener(new WaveView.PrecentChangeListener() {
            @Override
            public void precentChange(double precent) {
                tvPrecent.setText("当前进度：" + precent + "");
            }
        });

        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waveview.start();
            }
        });

        btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waveview.stop();
            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waveview.reset();
            }
        });
    }
}
