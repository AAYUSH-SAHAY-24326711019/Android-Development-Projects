package com.example.androiduiwidgets;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ButtonClickEventTwo extends AppCompatActivity {

    EditText et_my_email;
    Button btn_two;
    TextView tv_my_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_button_click_event_two);
        et_my_email=(EditText)findViewById(R.id.et_email);
        btn_two=(Button)findViewById(R.id.btn_two);
        tv_my_email=(TextView)findViewById(R.id.tv_email);

    }
    public void getUserEmail(View view){
        String email =et_my_email.getText().toString();
//        tv_my_email.setText("Email :"+email);
        Toast.makeText(getApplicationContext(),"Email "+email,Toast.LENGTH_LONG).show();

    }
}
