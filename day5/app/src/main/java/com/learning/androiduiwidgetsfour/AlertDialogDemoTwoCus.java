package com.learning.androiduiwidgetsfour;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlertDialogDemoTwoCus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_dialog_demo_two_cus);

    }
    public void openCustomAlertDialog(View view){
        Dialog dialog = new Dialog(AlertDialogDemoTwoCus.this);
        dialog.setContentView(R.layout.custom_alertdialog);

        Button cus_dialog_btn = (Button) dialog.findViewById(R.id.cus_dialog_btn);
        cus_dialog_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
                Toast.makeText(AlertDialogDemoTwoCus.this, "Custom Dialog opened", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();

    }
}