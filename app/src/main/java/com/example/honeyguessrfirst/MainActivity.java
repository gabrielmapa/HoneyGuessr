package com.example.honeyguessrfirst;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    public Button startBtn;
    public Button aboutBtn;
    public Button instructBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

        startBtn = (Button) findViewById(R.id.start_button);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategories();
            }
        });

        aboutBtn = (Button) findViewById(R.id.about_button);
        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openAboutbutton(); }
        });

        instructBtn = (Button) findViewById(R.id.instructions_btn);
        instructBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openInstructionbutton(); }
        });
    }
    public void openCategories() {
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
    }
    public void openAboutbutton() {
        Intent about = new Intent(this, AboutBtn.class);
        startActivity(about);
    }
    public void openInstructionbutton() {
        Intent instruct = new Intent(this, Instructions.class);
        startActivity(instruct);
    }
}
