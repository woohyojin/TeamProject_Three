package com.example.othercock.ui.stemp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.othercock.MainActivity;
import com.example.othercock.R;
import com.example.othercock.adapter.Barcode;
import com.example.othercock.adapter.UserInfoDto;
import com.example.othercock.ui.coopone.CooponeFragment;
import com.example.othercock.ui.coopone.CouponFrag;
import com.example.othercock.ui.menu.MenuFragment;

import java.util.ArrayList;


public class StampFrag extends Fragment {
    View view;

    int imgIndex = 0;
    int img[] = {R.id.iceStamp1, R.id.iceStamp2, R.id.iceStamp3, R.id.iceStamp4,
            R.id.iceStamp5, R.id.iceStamp6, R.id.iceStamp7, R.id.iceStamp8, R.id.iceStamp9,
            R.id.iceStamp10};

    ArrayList<UserInfoDto> info;
    int stamp;
    String id, pw, name, email, phone, nick;
    Button exOrderBtn;
    Button addStampBtn;
    Button couponChangBtn;
    int CouMax = 10;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.stampfragment, container, false);
        exOrderBtn = (Button) view.findViewById(R.id.exOrderBtn);
        addStampBtn = (Button) view.findViewById(R.id.addStampBtn);
        couponChangBtn = (Button) view.findViewById(R.id.couponChangBtn);


        ImageView img2[] = new ImageView[10];


        int test = imgIndex;

        for (int i = 0; i < img2.length; i++) {
            img2[i] = (ImageView) view.findViewById(img[i]);
        }


        View.OnClickListener onClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.exOrderBtn:
                        Toast.makeText(getContext(), "버튼눌림", Toast.LENGTH_SHORT).show();
                        if (imgIndex < CouMax - 1) {
                            img2[imgIndex].setImageResource(R.drawable.stampcheck);
                            imgIndex++;
                        } else if (imgIndex == 9) {

                        } else {
                            imgIndex = 0;
                        }

                        System.out.println(imgIndex);
                        break;
                    case R.id.addStampBtn:
                        Intent intent = new Intent(getContext(), Barcode.class);
                        startActivity(intent);
                        break;
                    case R.id.couponChangBtn:
                        ((MainActivity)getActivity()).fragmentCooponeBox();
                        break;
                }
            }
        };
        exOrderBtn.setOnClickListener(onClick);
        addStampBtn.setOnClickListener(onClick);
        couponChangBtn.setOnClickListener(onClick);

        return view;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        info = new ArrayList<>();
        for (int i = 0; i < info.size(); i++) {
            stamp = info.get(i).getUserStamp();
            id = info.get(i).getUserId().toString();
            pw = info.get(i).getUserPw().toString();
            name = info.get(i).getUserName().toString();
            email = info.get(i).getUserEmail().toString();
            phone = info.get(i).getUserPhone().toString();
            nick = info.get(i).getUserNick().toString();

            info.add(new UserInfoDto(stamp, id, pw, name, email, phone, nick));
        }
    }


}


