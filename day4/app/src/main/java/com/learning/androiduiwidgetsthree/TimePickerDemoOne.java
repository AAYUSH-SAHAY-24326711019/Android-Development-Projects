package com.learning.androiduiwidgetsthree;

import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TimePickerDemoOne extends AppCompatActivity {
    TimePicker timepicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_time_picker_demo_one);
        timepicker = (TimePicker) findViewById(R.id.timepicker);
        timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(TimePickerDemoOne.this, ""+hourOfDay+":"+minute, Toast.LENGTH_LONG).show();
            }
        });

    }
}