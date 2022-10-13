package com.example.stsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TestSelection extends AppCompatActivity {

    private EditText id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_selection);

        id = findViewById(R.id.id);
    }

    public void enterClick(View view){
        if(!id.getText().toString().equals("")){
            Intent intent = new Intent(this, Statistics.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Please Enter Test ID", Toast.LENGTH_SHORT).show();
        }
    }
}