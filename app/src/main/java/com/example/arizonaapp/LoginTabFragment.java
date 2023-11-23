package com.example.arizonaapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    EditText email, password;
    Button login;
    TextView forgotPass;

    float v = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container,false);

        email = root.findViewById(R.id.edt_email);
        password = root.findViewById(R.id.edt_password);
        login = root.findViewById(R.id.btn_login);
        forgotPass = root.findViewById(R.id.txt_forgot);

        email.setTranslationY(300);
        password.setTranslationY(300);
        forgotPass.setTranslationY(300);
        login.setTranslationY(300);

        email.setAlpha(v);
        password.setAlpha(v);
        forgotPass.setAlpha(v);
        login.setAlpha(v);

        email.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400).start();
        password.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(600).start();
        forgotPass.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(800).start();
        login.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(300).start();



        return root;
    }
}
