package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModLogIn extends AppCompatActivity implements View.OnClickListener{

    UserLocalStorage userLocalStorage;
    Button logInButton, newRegistryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mod_log_in);

        logInButton = (Button) findViewById(R.id.login_button);
        newRegistryButton = (Button) findViewById(R.id.newRegistry);

        logInButton.setOnClickListener(this);
        newRegistryButton.setOnClickListener(this);

        userLocalStorage = new UserLocalStorage(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.login_button:

                User user= new User(null, null);

                userLocalStorage.storeUserData(user);
                userLocalStorage.setUserLoggedIn(true);

                startActivity(new Intent(this, Moderator.class));
                break;
            case R.id.newRegistry:
                startActivity((new Intent(this, ModRegistry.class)));
                break;
        }
    }
}