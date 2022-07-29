package com.example.honeyguessrfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Moderator extends AppCompatActivity implements View.OnClickListener{

    UserLocalStorage userLocalStorage;
    Button logoutButton;
    EditText getName, getUsername, getPassword;

    @Override
    protected void onStart() {
        super.onStart();

        if (loginAuthentication() == true){
            displayUserDetails();
        }
        else{
            startActivity(new Intent(Moderator.this, ModLogIn.class));
        }
    }

    private void displayUserDetails() {
        User user = userLocalStorage.getLoggedInUser();
        getUsername.setText(user.username);
        getName.setText(user.name);
    }

    private boolean loginAuthentication(){
        if (userLocalStorage.getLoggedInUser() == null) {
            Intent intent = new Intent(this, ModLogIn.class);
            startActivity(intent);

            return false;
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moderator);

        logoutButton = (Button) findViewById(R.id.logOut);
        getName = (EditText) findViewById(R.id.name);
        getUsername = (EditText) findViewById(R.id.username);
        getPassword = (EditText) findViewById(R.id.password);

        logoutButton.setOnClickListener(this);

        userLocalStorage = new UserLocalStorage(this);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.logOut:
                userLocalStorage.clearUserData();
                userLocalStorage.setUserLoggedIn(false);

                startActivity(new Intent(this, ModLogIn.class));
                break;
        }
    }

}
