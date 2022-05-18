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

import com.example.othercock.MainActivity;
import com.example.othercock.R;
import com.example.othercock.databinding.FragmentOthermainBinding;


public class OtherFragment extends Fragment {
    LinearLayout layout;
    LinearLayout order_his;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_othermain,container,false);
        order_his = (LinearLayout) root.findViewById(R.id.ordermain_list_orderhistory);
        order_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).testFragment();
            }
        });
        layout = (LinearLayout) root.findViewById(R.id.linear_menu);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ((MainActivity)getActivity()).testFragment2();
            }
        });

        return root;
    }
}
