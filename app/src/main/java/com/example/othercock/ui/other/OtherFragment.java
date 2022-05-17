package com.example.othercock.ui.other;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.othercock.R;
import com.example.othercock.databinding.FragmentOthermainBinding;


public class OtherFragment extends Fragment {
    FragmentOthermainBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_othermain,container,false);

        LinearLayout layout = (LinearLayout) root.findViewById(R.id.linear_menu);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("성공이냐?");
            }
        });

        return root;
    }
}
