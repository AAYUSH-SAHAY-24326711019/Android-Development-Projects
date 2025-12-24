package com.learning.formdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ToggleBtnSwitchDemo extends AppCompatActivity {
    ToggleButton wifi_togglebtn;
    Switch wifi_switch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_toggle_btn_switch_demo);
        wifi_togglebtn = (ToggleButton) findViewById(R.id.wifi_togglebtn);
        wifi_switch =(Switch) findViewById(R.id.wifi_switch);
    }
    public void getValToggleButton(View view){
        if(wifi_togglebtn.isChecked()){
            Toast.makeText(this, "Wifi on", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Wifi off", Toast.LENGTH_SHORT).show();
        }
    }

    public void getValueFromSwitch(View view){
        if(wifi_switch.isChecked()){
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show();
        }
    }
}