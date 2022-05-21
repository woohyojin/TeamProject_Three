package com.example.othercock.ui.coopone;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.othercock.MainActivity;
import com.example.othercock.R;
import com.example.othercock.databinding.FragmentSlideshowBinding;

public class CooponeFragment extends Fragment {

    private FragmentSlideshowBinding binding;

    TextView useBtn, lastBtn, hurryCouponBtn, newCouponBtn;
    //FragmentManager fm;
    FragmentManager fm;
    FragmentTransaction tran;
    CouponFrag frag;
    CouponFrag2 frag2;
  //  ImageView backImage;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View root = inflater.inflate(R.layout.fragment_coopone,container,false);
        View root = inflater.inflate(R.layout.fragment_coopone, container, false);


        useBtn = root.findViewById(R.id.useBtn);
        lastBtn = root.findViewById(R.id.lastBtn);
        hurryCouponBtn = root.findViewById(R.id.hurryCouponBtn);
        newCouponBtn = root.findViewById(R.id.newCouponBtn);


      //  backImage = root.findViewById(R.id.backImage);

        frag = new CouponFrag();
        frag2 = new CouponFrag2();
        setFrag(0);// 프래그먼트 교체

//        backImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getContext(), MainActivity.class);
//                startActivity(intent);
//            }
//        });
        Button.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.useBtn:
                        setFrag(0);

                        break;
                    case R.id.lastBtn:
                        setFrag(1);

                        break;
                    case R.id.hurryCouponBtn:
                        Toast.makeText(getContext(), "마감임박", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.newCouponBtn:
                        Toast.makeText(getContext(), "최신쿠폰", Toast.LENGTH_LONG).show();
                        break;

                }
            }
        };
        useBtn.setOnClickListener(onClickListener);
        lastBtn.setOnClickListener(onClickListener);
        hurryCouponBtn.setOnClickListener(onClickListener);
        newCouponBtn.setOnClickListener(onClickListener);


        return root;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void setFrag(int num) {    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
        fm = getChildFragmentManager();
        // fm = getFragmentManager();
        tran = fm.beginTransaction();
        switch (num) {
            case 0:
                tran.replace(R.id.cooponeFrag, frag);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;
            case 1:
                tran.replace(R.id.cooponeFrag, frag2);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
                tran.commit();
                break;

        }
    }
}