package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutBtn extends AppCompatActivity {

    public Button backAbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_btn);

        backAbt = (Button) findViewById(R.id.backAbout);
        backAbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openBackAbt(); }
        });
    }
    public void openBackAbt() {
        Intent backAb = new Intent(this, MainActivity.class);
        startActivity(backAb);
    }
}