package com.example.othercock.ui.menu;

import android.content.Context;
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

import com.example.othercock.Item;
import com.example.othercock.ItemAdapter;
import com.example.othercock.R;

import java.util.ArrayList;

public class MenuFragment extends Fragment {

    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu,container,false);

        recyclerView = (RecyclerView) root.findViewById(R.id.recyclerView);
        linearLayoutManager = new GridLayoutManager(container.getContext(),2,GridLayoutManager.VERTICAL,false);

        ArrayList<Item> list = new ArrayList<Item>();
        for (int i = 0; i <= 20; i++) {
            //list.add(new Item("설빙 메뉴 " + i, R.drawable.ic_launcher_foreground));
            list.add(new Item("설빙 메뉴 " + i, R.drawable.testimg));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        ItemAdapter adapter = new ItemAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setLayoutManager(linearLayoutManager);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}