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
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.example.othercock.R;
import com.example.othercock.Socket.Protocol;
import com.example.othercock.Socket.service_Socket;

import org.jetbrains.annotations.NotNull;
import org.w3c.dom.Text;


public final class LoginFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_login,container,false);
        Button btn = (Button)root.findViewById(R.id.button_signin);

        EditText id = (EditText)root.findViewById(R.id.et_username);
        EditText password = (EditText)root.findViewById(R.id.et_password);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("버튼_signin");
                Intent intent = new Intent(getContext(), service_Socket.class);
                intent.putExtra("pw", Protocol.LOGIN +"|"+id.getText().toString() +"|" +password.getText().toString());
                getActivity().startService(intent);
                getActivity().findViewById(R.id.nav_view).setEnabled(false);
            }
        });
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
}
