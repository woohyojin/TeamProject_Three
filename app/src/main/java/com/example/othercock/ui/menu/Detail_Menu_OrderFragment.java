package com.example.othercock.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.othercock.R;

public class Detail_Menu_OrderFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_detail_menu_order,container,false); // 상세메뉴 켜기. (detail_menu.xml)실행
        //setContentView(R.layout.fragment_detail_menu); // activity_lock_screen.xml 액티비티를 실행함.

        /*((MainActivity)getActivity()).퍼블릭설정된어레이리스트*/
        System.out.println("여기");

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}

