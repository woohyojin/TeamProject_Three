package com.example.othercock.ui.menu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.othercock.DTO.OrderMenu;
import com.example.othercock.DTO.User;
import com.example.othercock.Item;
import com.example.othercock.ItemAdapter;
import com.example.othercock.MainActivity;
import com.example.othercock.R;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    User user;
    ArrayList<OrderMenu> menuList;
    ArrayList<OrderMenu> menuArrayList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu,container,false);
        user = ((MainActivity)getActivity()).settingUser(null);
        if( user !=null){
            menuArrayList = ((MainActivity)getActivity()).settingMenu(null);
            /*getmenuArrayList();*/
        }

        System.out.println(menuArrayList);
        System.out.println("어레이리스트");
        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        linearLayoutManager = new GridLayoutManager(container.getContext(),2,GridLayoutManager.VERTICAL,false);

        ArrayList<Item> list = new ArrayList<Item>();
        for (int i = 0; i <= 20; i++) {
            //list.add(new Item("설빙 메뉴 " + i, R.drawable.ic_launcher_foreground));
            list.add(new Item("설빙 메뉴 " + i, R.drawable.testimg));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        ItemAdapter adapter = new ItemAdapter(list, root.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(linearLayoutManager);
        return root;



    }

    /*private void getmenuArrayList(){
        for(int i=0;i<menuArrayList.size();i++){
            if(menuArrayList.get(i)."여기는 뭘까"()==1){
                for(int j=0;j<menuList.size();j++){
                    if(menuList.get(j).getNumber()==menuArrayList.get(i).getNumber()){
                        System.out.println(menuList.get(i));
                        OrderMenu orderMenu = menuList.get(i);
                        menuArrayList.add(orderMenu);
                    }
                }
            }
        }
    }*/


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}