package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ModRegistry extends AppCompatActivity implements View.OnClickListener {

    Button regNewButton;
    EditText getName, getUsername, getPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_registry);

        regNewButton = (Button) findViewById(R.id.newRegistry);
        getName = (EditText) findViewById(R.id.name);
        getUsername = (EditText) findViewById(R.id.username);
        getPassword = (EditText) findViewById(R.id.password);

        regNewButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.newRegistry:

                String name = getName.getText().toString();
                String username = getUsername.getText().toString();
                String password = getPassword.getText().toString();

                User user = new User(name, username, password);

                break;
        }
    }
}