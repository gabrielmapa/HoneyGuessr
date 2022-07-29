package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Instructions extends AppCompatActivity {

    public Button backInstruct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);

        backInstruct = (Button) findViewById(R.id.backInstruction);
        backInstruct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openBackInstruct(); }
        });
    }
    public void openBackInstruct() {
        Intent backIns = new Intent(this, MainActivity.class);
        startActivity(backIns);
    }
}