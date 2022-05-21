//`package com.example.othercock.ui.coopone;
//
//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.othercock.MainActivity;
//import com.example.othercock.R;
//
//
//public class Coupon extends AppCompatActivity {
//    TextView useBtn, lastBtn, hurryCouponBtn, newCouponBtn;
//    FragmentManager fm;
//    FragmentTransaction tran;
//    CouponFrag frag;
//    CouponFrag2 frag2;
//    ImageView backImage;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_coupon);
//
//        useBtn = findViewById(R.id.useBtn);
//        lastBtn = findViewById(R.id.lastBtn);
//        hurryCouponBtn = findViewById(R.id.hurryCouponBtn);
//        newCouponBtn = findViewById(R.id.newCouponBtn);
//
//
//        backImage = findViewById(R.id.backImage);
//
//        frag = new CouponFrag();
//        frag2 = new CouponFrag2();
//        setFrag(0);// 프래그먼트 교체
//
//        backImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
//            }
//        });
//        Button.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.useBtn:
//                        setFrag(0);
//
//                        break;
//                    case R.id.lastBtn:
//                        setFrag(1);
//
//                        break;
//                    case R.id.hurryCouponBtn:
//                        Toast.makeText(getApplicationContext(), "마감임박", Toast.LENGTH_LONG).show();
//                        break;
//                    case R.id.newCouponBtn:
//                        Toast.makeText(getApplicationContext(), "최신쿠폰", Toast.LENGTH_LONG).show();
//                        break;
//
//                }
//            }
//        };
//        useBtn.setOnClickListener(onClickListener);
//        lastBtn.setOnClickListener(onClickListener);
//        hurryCouponBtn.setOnClickListener(onClickListener);
//        newCouponBtn.setOnClickListener(onClickListener);
//    }
//
//    public void setFrag(int num) {    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
//        fm = getFragmentManager();
//        tran = fm.beginTransaction();
//        switch (num) {
//            case 0:
//                tran.replace(R.id.mainFrag, frag);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
//                tran.commit();
//                break;
//            case 1:
//                tran.replace(R.id.mainFrag, frag2);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
//                tran.commit();
//                break;
//
//        }
//    }
//
//}`