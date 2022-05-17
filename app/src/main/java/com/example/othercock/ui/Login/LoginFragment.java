package com.example.othercock.ui.Login;

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

//        if (view.getId() == R.id.button_signup) {
//            this.startActivity(new Intent((Context)this, SignupActivity.class));
//        } else if (view.getId() == R.id.button_forgot_password) {
//            this.startActivity(new Intent((Context)this, ForgotPasswordActivity.class));
//        } else if (view.getId() == R.id.button_signin){
//
//        }

    }

}
