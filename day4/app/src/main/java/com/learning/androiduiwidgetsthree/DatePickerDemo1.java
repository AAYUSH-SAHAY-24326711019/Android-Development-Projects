package com.learning.androiduiwidgetsthree;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class DatePickerDemo1 extends AppCompatActivity {
    DatePicker datepicker_one;
    DatePickerDialog datePickerDialog;
    TextView tv_date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_date_picker_demo1);
       tv_date = (TextView) findViewById(R.id.tv_date);
        Calendar c  = Calendar.getInstance();
        int year= c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);
        tv_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 datePickerDialog = new DatePickerDialog(
                        DatePickerDemo1.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        tv_date.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                    }
                },year,month,day);
                datePickerDialog.show();
            }
        });

    }
}