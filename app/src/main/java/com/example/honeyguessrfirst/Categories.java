package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    private Button ArtsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ArtsBtn = findViewById(R.id.artsculture_button);
        ArtsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intenter = new Intent(Categories.this,
                        QuestionNumber1.class);
                startActivity(intenter);
            }
        });

    }

}