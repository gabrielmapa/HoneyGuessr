package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    public Button ArtsBtn;
    public Button HistoryBtn;
    public Button GeneralBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ArtsBtn = (Button) findViewById(R.id.artsculture_button);
        ArtsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openArtsQuestion1(); }
        });

        HistoryBtn = (Button) findViewById(R.id.history_button);
        HistoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openHistoryQuestion1(); }
        });

        GeneralBtn = (Button) findViewById(R.id.generalknowledge_button);
        GeneralBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openGeneralQuestion1(); }
        });
    }
    public void openArtsQuestion1() {
        startActivity(new Intent(getApplicationContext(), ArtsQ1.class));
    }
    public void openHistoryQuestion1() {
        startActivity(new Intent(getApplicationContext(), HistoryQ1.class));
    }
    public void openGeneralQuestion1() {
        startActivity(new Intent(getApplicationContext(), GeneralKnowledgeQ1.class));
    }
}