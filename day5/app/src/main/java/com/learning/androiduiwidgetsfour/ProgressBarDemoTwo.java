package com.learning.androiduiwidgetsfour;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProgressBarDemoTwo extends AppCompatActivity {
    ProgressBar my_progressbar;
    Button progressbar_btn;
    int progress_value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_progress_bar_demo_two);

    }

    public void startProgressBar(View view){
        my_progressbar = (ProgressBar) findViewById(R.id.my_progressbar);
        setProgressBarValue(progress_value);
        progressbar_btn = (Button) findViewById(R.id.progressbar_btn);
        progressbar_btn.setVisibility(View.GONE);
    }

    void setProgressBarValue(int i){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
                my_progressbar.setProgress(i);
                setProgressBarValue(i+1);
                if(progress_value==100){
                    progress_value=0;
                }

            }
        });
        thread.start();
    }
}