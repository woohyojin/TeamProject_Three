package com.example.othercock.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.othercock.DTO.User;
import com.example.othercock.MainActivity;
import com.example.othercock.R;
import com.example.othercock.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    User user;
    LinearLayout orderBtn;
    LinearLayout starBtn;
    LinearLayout storeBtn;
    LinearLayout cooponeBtn;

    OCL ocl = new OCL();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        user = ((MainActivity)getActivity()).settingUser(null);

        orderBtn = root.findViewById(R.id.orderBtn);
        starBtn = root.findViewById(R.id.starBtn);
        storeBtn = root.findViewById(R.id.storeBtn);
        cooponeBtn = root.findViewById(R.id.cooponeBtn);

        orderBtn.setOnClickListener(ocl);
        starBtn.setOnClickListener(ocl);
        storeBtn.setOnClickListener(ocl);
        cooponeBtn.setOnClickListener(ocl);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    class OCL implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.orderBtn){
                ((MainActivity)getActivity()).fragmentOrder();
            } else if(view.getId()==R.id.starBtn){
                ((MainActivity)getActivity()).FavoriteMenu();
            } else if(view.getId()==R.id.cooponeBtn){
                ((MainActivity)getActivity()).fragmentCoopne();
            } else if(view.getId()==R.id.storeBtn){
                ((MainActivity)getActivity()).fragmentStore();
            }
        }
    }
}