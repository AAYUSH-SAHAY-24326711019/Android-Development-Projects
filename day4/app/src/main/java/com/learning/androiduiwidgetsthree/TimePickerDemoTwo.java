package com.learning.androiduiwidgetsthree;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class TimePickerDemoTwo extends AppCompatActivity {
    TextView tv_time;
    TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time_picker_demo_two);
        tv_time=(TextView) findViewById(R.id.tv_time);
        Calendar c  = Calendar.getInstance();
        int hour= c.get(Calendar.HOUR);
        int minute = c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);
        tv_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timePickerDialog=new TimePickerDialog(TimePickerDemoTwo.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourr, int minn) {
                        tv_time.setText(hourr+":"+minn);
                    }
                },hour,minute,false);
                timePickerDialog.show();
            }
        });
    }
}