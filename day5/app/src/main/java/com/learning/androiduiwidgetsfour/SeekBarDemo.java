package com.learning.androiduiwidgetsfour;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SeekBarDemo extends AppCompatActivity {
    SeekBar mySeekbar;
    TextView sb_value;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_seek_bar_demo);
        mySeekbar = (SeekBar) findViewById(R.id.mySeekbar);
        sb_value = (TextView) findViewById(R.id.sb_value);



        mySeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progress_value=0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progress_value=progress;
                sb_value.setText(progress_value+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}