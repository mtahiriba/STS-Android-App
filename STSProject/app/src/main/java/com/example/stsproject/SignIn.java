package com.example.stsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    private EditText user;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        user = findViewById(R.id.Username);
        pass = findViewById(R.id.password);

    }

    public void forgetPassword(View view){
        Toast.makeText(this, "Forget Password click", Toast.LENGTH_SHORT).show();
    }

    public  void signIn(View view){
        if(user.getText().toString().equals("023-19-0144") && pass.getText().toString().equals("123")){
            Intent intent = new Intent(this, TestSelection.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(this, "User or Password was incorrect!", Toast.LENGTH_SHORT).show();
        }
    }

    public  void continueWithGoogle(View view){
        Toast.makeText(this, "Continue with google click", Toast.LENGTH_SHORT).show();
    }
}