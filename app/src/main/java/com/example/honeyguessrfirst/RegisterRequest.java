package com.example.honeyguessrfirst;

import androidx.annotation.Nullable;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {

    private static final String REGISTER_REQUEST_URL = "cushitic-dozen.000webhostapp.com/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String name, String usernane, String password, Response.Listener<String> listener){
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("username", usernane);
        params.put("password", password);
    }

    @Nullable
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
