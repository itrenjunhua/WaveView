package com.waveview.activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.waveview.R;
import com.waveview.view.WaveView;

/**
 * ======================================================================
 * <p/>
 * 作者：Renj
 * <p/>
 * 创建时间：2016-12-23    9:24
 * <p/>
 * 描述：
 * <p/>
 * 修订历史：
 * <p/>
 * ======================================================================
 */
public class RectActivity extends Activity {
    private WaveView waveview1;
    private WaveView waveview2;
    private WaveView waveview3;
    private Button btStart;
    private Button btStop;
    private Button btReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rect);

        btStart = (Button) findViewById(R.id.bt_start);
        btStop = (Button) findViewById(R.id.bt_stop);
        btReset = (Button) findViewById(R.id.bt_reset);

        waveview1 = (WaveView) findViewById(R.id.waveview1);
        waveview2 = (WaveView) findViewById(R.id.waveview2);
        waveview3 = (WaveView) findViewById(R.id.waveview3);
        // 代码设置相关属性
        waveview1.setBorderWidth(2)
                .setWaveColor1(Color.RED)
                .setWaveColor2(Color.parseColor("#80ff0000"))
                .setBorderColor(Color.GREEN)
                .setTextColor(Color.BLUE)
                .setShape(WaveView.ShowShape.RECT)
                .setTextSize(36)
                .setPrecent(0.65f)
                .setTime(2);

        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waveview1.start();
                waveview2.start();
                waveview3.start();
            }
        });

        btStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waveview1.stop();
                waveview2.stop();
                waveview3.stop();
            }
        });

        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                waveview1.reset();
                waveview2.reset();
                waveview3.reset();
            }
        });
    }
}
