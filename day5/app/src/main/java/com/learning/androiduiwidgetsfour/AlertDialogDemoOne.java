package com.learning.androiduiwidgetsfour;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlertDialogDemoOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_alert_dialog_demo_one);

    }
    public void openAlertDialog(View view){
        AlertDialog.Builder alertDialogBuilder =
                new AlertDialog.Builder(AlertDialogDemoOne.this);
        alertDialogBuilder.setIcon(R.drawable.circular);
        alertDialogBuilder.setTitle("Close Window");
        alertDialogBuilder.setMessage("Do you want to close this window ?");
        alertDialogBuilder.setCancelable(false);


        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogDemoOne.this, "You clicked yes", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogDemoOne.this, "No", Toast.LENGTH_SHORT).show();
            }
        });

        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogDemoOne.this, "No problem", Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.show();
    }
}