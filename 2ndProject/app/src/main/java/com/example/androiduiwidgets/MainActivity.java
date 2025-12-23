package com.example.androiduiwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et_my_name;
    Button my_btn_one;
    TextView tv_my_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //get the id
        et_my_name=(EditText) findViewById(R.id.et_name);
        my_btn_one=(Button)findViewById(R.id.btn_one);
        tv_my_name=(TextView) findViewById(R.id.tv_name);

        //add click listener
        my_btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et_my_name.getText().toString();
                tv_my_name.setText("Hello :"+name);
            }
        });
    }
}