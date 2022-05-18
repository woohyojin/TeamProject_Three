package com.example.othercock.ui.Login;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.othercock.R;
import com.example.othercock.Socket.service_Socket;

import org.jetbrains.annotations.NotNull;


public final class LoginFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_login,container,false);
        setStatusBarTransparent((AppCompatActivity)getActivity());


        return root;
    }

    private final void setStatusBarTransparent(AppCompatActivity activity) {
        if (VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        if (VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
            activity.getWindow().setStatusBarColor(Color.WHITE);
        }

    }

    public final void onClick(@NotNull View view) {

        if (view.getId() == R.id.button_signup) {


        } else if (view.getId() == R.id.button_forgot_password) {

        } else if (view.getId() == R.id.button_signin){
            Intent intent = new Intent(getContext(), service_Socket.class);
            intent.putExtra("pw", R.id.et_username +"|"+ R.id.et_password);
            getActivity().startService(intent);

        }

    }

}
