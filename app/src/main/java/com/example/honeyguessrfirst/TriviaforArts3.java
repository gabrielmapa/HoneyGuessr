package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TriviaforArts3 extends AppCompatActivity {

    public Button mainmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triviafor_arts3);

        mainmenu = (Button) findViewById(R.id.back);
        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openMainMenu (); }
        });
    }
    public void openMainMenu() {
        Intent backMain = new Intent(TriviaforArts3.this, MainActivity.class);
        startActivity(backMain);
    }
}