package com.learning.androiduiwidgetsthree;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class DatePickerDemoTwo extends AppCompatActivity {
    DatePicker datepicker_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_date_picker_demo_two);
        datepicker_two =(DatePicker) findViewById(R.id.datepicker_two);


    }
   public void getDateMonthYear(View view){
//        int month=datepicker_two.getMonth()+1;
//        int year = datepicker_two.getYear();
//        int day = datepicker_two.getDayOfMonth();
//       Toast.makeText(this, "Month :"+month+
//               " \nYear:"+year+" \nDay:", Toast.LENGTH_SHORT).show();

       Calendar c = Calendar.getInstance();
       int Date = c.get(Calendar.DATE);
       int month = c.get(Calendar.MONTH);
       int year = c.get(Calendar.YEAR);
       int day = c.get(Calendar.DAY_OF_WEEK)-1;
       String day_name="";
       switch(day){
           case 0: day_name="Sunday"; break;
           case 1: day_name="Monday"; break;
           case 2: day_name="Tuesday"; break;
           case 3: day_name="Wednesday"; break;
           case 4: day_name="Thursday"; break;
           case 5: day_name="Friday"; break;
           case 6: day_name="Saturday"; break;
       }
       String res = "["+Date+"/"+(month+1)+"/"+year+" Day:"+day_name+"]";
       Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
   }
}