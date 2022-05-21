package com.example.othercock.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.othercock.DTO.OrderMenu;
import com.example.othercock.MainActivity;
import com.example.othercock.R;

import java.util.ArrayList;

public class Detail_Menu_OrderFragment extends Fragment {
    Button order, cart;
    OCL click = new OCL();
    TextView name;
    TextView kcal;
    TextView allergy;
    ImageView img;

    OrderMenu menu;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detail_menu_order,container,false); // 상세메뉴 켜기. (detail_menu.xml)실행
        menu = new OrderMenu();
        menu = ((MainActivity)getActivity()).getThisMenu();
        //setContentView(R.layout.fragment_detail_menu); // activity_lock_screen.xml 액티비티를 실행함.
        /*((MainActivity)getActivity()).퍼블릭설정된어레이리스트*/

        //아이디가필요해 TextView ㅇㅇ
        cart = (Button) root.findViewById(R.id.detail_cartBtn);
        order = (Button) root.findViewById(R.id.detail_orderBtn);
        cart.setOnClickListener(click);
        order.setOnClickListener(click);

        img = (ImageView) root.findViewById(R.id.detail_order_img);
        img.setImageResource(menu.getResource());
        name = (TextView) root.findViewById(R.id.detail_order_name);
        name.setText(menu.getName());
        kcal = (TextView) root.findViewById(R.id.detail_order_nutrition_info_detail);
        kcal.setText(String.valueOf(menu.getKcal())+"kcal");
        allergy = (TextView) root.findViewById(R.id.detail_order_allergy_info_detail);
        allergy.setText(menu.getAllregy());

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
    class OCL implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            if(view.getId()==R.id.detail_cartBtn){
                System.out.println("이건카트");
            } else if(view.getId()==R.id.detail_orderBtn){
                System.out.println("이건오더");
            }
        }
    }
}

