package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    Button ModAccessButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);


        ModAccessButton = (Button) findViewById(R.id.ModLogIn);
        backButton = (Button) findViewById(R.id.backButton);

        ModAccessButton.setOnClickListener(this);
        backButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ModLogIn:
                startActivity(new Intent(this, ModLogIn.class));
                break;

            case R.id.backButton:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}