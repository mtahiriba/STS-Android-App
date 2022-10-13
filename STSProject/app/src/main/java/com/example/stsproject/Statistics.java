package com.example.stsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Statistics extends AppCompatActivity {

    private ProgressBar present;
    private ProgressBar absent;
    private ProgressBar validate;
    private ProgressBar notValicdate;

    private int total_present = 130;
    private int total_validate = 39;

    private int t_present = 91;
    private int t_absent = 39;
    private int t_validate = 10;
    private int t_nonValidate = 29;

    private int presentValue;
    private int absentValue;
    private int validateValue;
    private int notValidateValue;

    int p = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        present = findViewById(R.id.present);
        absent = findViewById(R.id.absent);
        validate = findViewById(R.id.validate);
        notValicdate = findViewById(R.id.notValidate);

        TextView presentcount = findViewById(R.id.textView12);
        presentcount.setText(("" + t_present));
        TextView absentcount = findViewById(R.id.textView13);
        absentcount.setText(("" + t_absent));
        TextView validatecount = findViewById(R.id.textView14);
        validatecount.setText(("" + t_validate));
        TextView notValidatecount = findViewById(R.id.textView15);
        notValidatecount.setText(("" + t_nonValidate));

        presentValue = (t_present * 100)/total_present;
        absentValue = (t_absent * 100)/ total_present;
        validateValue = (t_validate * 100) / total_validate;
        notValidateValue= (t_nonValidate * 100) / total_validate;

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if(p<=presentValue){
                    present.setProgress(p);
                }
                if(p<=absentValue){
                    absent.setProgress(p);
                }
                if(p<=validateValue){
                    validate.setProgress(p);
                }
                if(p<=notValidateValue){
                    notValicdate.setProgress(p);
                }
                if(p>presentValue && p>absentValue && p>validateValue && p>notValidateValue){
                    handler.removeCallbacks(this);
                }
                else{
                    p++;
                    handler.postDelayed(this, 10);
                }
            }
        }, 10);

    }

    public  void backClick(View view){
        finish();
    }

    public void refresh(View view){
        Toast.makeText(this, "Refresh Click", Toast.LENGTH_SHORT).show();
    }
}