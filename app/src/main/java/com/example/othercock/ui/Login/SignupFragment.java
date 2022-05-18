package com.example.othercock.ui.Login;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.example.othercock.R;
import com.example.othercock.Socket.Protocol;
import com.example.othercock.Socket.service_Socket;

import java.util.HashMap;

public final class SignupFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_signup,container,false);
        Toolbar toolbar = (Toolbar)getView().findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        ActionBar actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();




        if (actionBar != null) {
            actionBar.setDisplayShowTitleEnabled(false);
        }

        Button but = (Button)getView().findViewById(R.id.button_signin);
        EditText editEmail = (EditText)getView().findViewById(R.id.et_email);
        EditText editUser = (EditText)getView().findViewById(R.id.et_username);
        EditText editPassword = (EditText)getView().findViewById(R.id.et_password);
        EditText editPhone = (EditText)getView().findViewById(R.id.et_phone);
        EditText editconfirmPassword = (EditText)getView().findViewById(R.id.et_confirm_password);



                but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editPassword.getText().toString().equals(editconfirmPassword.getText().toString())){
                    Intent intent = new Intent(getContext(), service_Socket.class);
                    intent.putExtra("pw", Protocol.REGISTER +"|"+ editEmail.getText().toString() + "|" + editUser.getText().toString() +
                            "|" +editPhone.getText().toString()+"|"+ editPassword.getText().toString());
                    getActivity().startService(intent);
                } else{
                    System.out.println("비밀번호가 일치 하지 않습니다.");
                }




            }
        });

        toolbar.setNavigationOnClickListener((View.OnClickListener)(new View.OnClickListener() {
            public final void onClick(View it) {
                //  SignupActivity.super.onBackPressed();
            }

        }));

    //setStatusBarWhite((AppCompatActivity)getActivity());
    return root;
    }

    private final void setStatusBarWhite(AppCompatActivity activity) {
        if (Build.VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            activity.getWindow().setStatusBarColor(Color.WHITE);
        }

    }



}