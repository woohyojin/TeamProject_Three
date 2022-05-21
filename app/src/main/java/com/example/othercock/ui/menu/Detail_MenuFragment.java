package com.example.othercock.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.othercock.MainActivity;
import com.example.othercock.R;

public class Detail_MenuFragment extends Fragment {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_detail_menu,container,false); // 상세메뉴 켜기. (detail_menu.xml)실행
        //setContentView(R.layout.fragment_detail_menu); // activity_lock_screen.xml 액티비티를 실행함.


        Log.d("타이틀", ((MainActivity)getActivity()).getTemp());
        /*((MainActivity)getActivity()).퍼블릭설정된어레이리스트*/

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
