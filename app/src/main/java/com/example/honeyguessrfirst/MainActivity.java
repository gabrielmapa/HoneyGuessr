package com.example.honeyguessrfirst;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button settingsButton;

    public Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout constraintLayout = findViewById(R.id.mainLayout);

        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(2000);
        animationDrawable.start();

<<<<<<< Updated upstream
        startBtn = (Button) findViewById(R.id.start_button);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCategories();
            }
        });
    }
    public void openCategories() {
        Intent intent = new Intent(this, Categories.class);
        startActivity(intent);
=======
        settingsButton = (Button) findViewById(R.id.settings_button);

        settingsButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.settings_button:
                startActivity(new Intent(this,Settings.class));
                break;

        }


>>>>>>> Stashed changes
    }
}
