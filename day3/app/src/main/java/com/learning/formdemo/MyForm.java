package com.learning.formdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MyForm extends AppCompatActivity {
    EditText et_name, et_password, et_phone;
    RadioButton rb_male,rb_female;
    CheckBox cb_android, cb_java,cb_python;
    Spinner sp_cities;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_form);

        et_name=(EditText)findViewById(R.id.et_name);
        et_password=(EditText)findViewById(R.id.et_password);
        et_phone=(EditText)findViewById(R.id.et_phone);

        rb_male=(RadioButton) findViewById(R.id.rb_male);
        rb_female=(RadioButton) findViewById(R.id.rb_female);

        cb_android=(CheckBox) findViewById(R.id.cb_android);
        cb_java=(CheckBox) findViewById(R.id.cb_java);
        cb_python=(CheckBox) findViewById(R.id.cb_python);

        sp_cities=(Spinner) findViewById(R.id.sp_cities);

    }
    public void getAllValues(View view){

    //--------edit text
        String name=et_name.getText().toString();
        String password=et_password.getText().toString();
        String phoneno=et_phone.getText().toString();
    //--------radio button
    String gender="";
    if(rb_male.isChecked()){
        gender=rb_male.getText().toString();
    }
    if(rb_female.isChecked()){
            gender=rb_female.getText().toString();
    }
    //-from the check box
        String interest="";
        if(cb_android.isChecked()){
            interest=interest+cb_android.getText().toString()+"\n";
        }
        if(cb_java.isChecked()){
            interest=interest+cb_java.getText().toString()+"\n";
        }
        if(cb_python.isChecked()){
            interest=interest+cb_python.getText().toString()+"\n";
        }

        //from spinner
        String city=sp_cities.getSelectedItem().toString();


        String res = "\n"+phoneno+"\n"+"{"+name+", "+password+
                ", "+gender+"} "+"\n{"+interest+"}"+"\n"+city;
        Toast.makeText(this, res, Toast.LENGTH_LONG).show();


    }
}