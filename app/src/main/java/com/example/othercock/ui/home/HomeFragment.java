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

import com.example.othercock.R;
import com.example.othercock.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
<<<<<<< Updated upstream
=======
    User user;
    LinearLayout orderBtn;
    LinearLayout starBtn;
    LinearLayout cooponeBtn;
    LinearLayout storeBtn;
    OCL onClick = new OCL();
>>>>>>> Stashed changes

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
<<<<<<< Updated upstream
=======
        user = ((MainActivity)getActivity()).settingUser(null);

        orderBtn = root.findViewById(R.id.orderBtn);
        starBtn = root.findViewById(R.id.starBtn);
        cooponeBtn = root.findViewById(R.id.cooponeBtn);
        storeBtn = root.findViewById(R.id.storeBtn);

        orderBtn.setOnClickListener(onClick);
        starBtn.setOnClickListener(onClick);
        cooponeBtn.setOnClickListener(onClick);
        storeBtn.setOnClickListener(onClick);


>>>>>>> Stashed changes
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    class OCL implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.orderBtn){
                ((MainActivity)getActivity()).fragmentOrder();
            } else if(view.getId()==R.id.starBtn){
                ((MainActivity)getActivity()).fragmentStar();
            } else if(view.getId()==R.id.cooponeBtn){
                ((MainActivity)getActivity()).fragmentCoopone();
            } else if(view.getId()==R.id.storeBtn){
                ((MainActivity)getActivity()).fragmentStore();
            }
        }
    }
}