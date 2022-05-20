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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.othercock.MainActivity;
import com.example.othercock.R;
import com.example.othercock.databinding.FragmentOthermainBinding;

import java.util.ArrayList;


public class OtherFragment extends Fragment {
    LinearLayout layout;
    LinearLayout order_his;
    LinearLayout star_menu;

    RecyclerView recyclerView1; // 인기메뉴
    RecyclerView recyclerView2; // 신메뉴
    LinearLayoutManager linearLayoutManager1;
    LinearLayoutManager linearLayoutManager2;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_othermain,container,false);
        order_his = (LinearLayout) root.findViewById(R.id.ordermain_list_orderhistory);
        order_his.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).fragmentOrderHistory();
            }
        });
        layout = (LinearLayout) root.findViewById(R.id.linear_menu);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).testFragment2();
                ((MainActivity)getActivity()).fragmentMenuFragment();
            }
        });
        star_menu = (LinearLayout) root.findViewById(R.id.star_menu);
        star_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).FavoriteMenu();
            }
        });

        recyclerView1 = (RecyclerView) root.findViewById(R.id.popuMenu); // 인기메뉴
        recyclerView2 = (RecyclerView) root.findViewById(R.id.newMenu); // 신메뉴
        linearLayoutManager1 = new GridLayoutManager(root.getContext(),1,GridLayoutManager.HORIZONTAL,false);
        linearLayoutManager2 = new GridLayoutManager(root.getContext(),1,GridLayoutManager.HORIZONTAL,false);

        ArrayList<PopuMenu> list = new ArrayList<PopuMenu>();
        for (int i = 0; i <= 20; i++) {
            //list.add(new Item("설빙 메뉴 " + i, R.drawable.ic_launcher_foreground));
            list.add(new PopuMenu("설빙 메뉴 " + i, R.drawable.testimg));
        }

        recyclerView1.setLayoutManager(new LinearLayoutManager(root.getContext()));
        OtherAdapter adapter = new OtherAdapter(list, root.getContext());
        recyclerView1.setAdapter(adapter);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setLayoutManager(linearLayoutManager1);

        recyclerView2.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerView2.setAdapter(adapter);
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setLayoutManager(linearLayoutManager2);


        return root;
    }
}
