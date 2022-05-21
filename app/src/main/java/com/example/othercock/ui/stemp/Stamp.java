//package com.example.othercock.ui.stemp;
//
//import android.app.FragmentManager;
//import android.app.FragmentTransaction;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.example.othercock.MainActivity;
//import com.example.othercock.R;
//
//public class Stamp extends AppCompatActivity {
//    FragmentManager fm;
//    FragmentTransaction tran;
//    StampFrag stampFrag;
//    StampFrag2 stampFrag2;
//    ImageView backImage;
//    TextView stampCardBText, showCardText;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_stamp);
//
//        stampCardBText = findViewById(R.id.stampCardBText);
//        showCardText = findViewById(R.id.showCardText);
//
//
//        backImage = findViewById(R.id.backImage);
//
//        stampFrag = new StampFrag();
//        stampFrag2 = new StampFrag2();
//        setFrag(0);// 프래그먼트 교체
//
//        backImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        TextView.OnClickListener onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.stampCardBText:
//                        setFrag(0);
//                        Toast.makeText(getApplicationContext(), "프래그1", Toast.LENGTH_LONG).show();
//                        break;
//                    case R.id.showCardText:
//                        setFrag(1);
//                        Toast.makeText(getApplicationContext(), "프래그2", Toast.LENGTH_LONG).show();
//                        break;
//
//                }
//            }
//        };
//        stampCardBText.setOnClickListener(onClickListener);
//        showCardText.setOnClickListener(onClickListener);
//    }
//
//    public void setFrag(int num) {    //프래그먼트를 교체하는 작업을 하는 메소드를 만들었습니다
//        fm = getFragmentManager();
//        tran = fm.beginTransaction();
//        switch (num) {
//            case 0:
//                tran.replace(R.id.mainStramFrag, stampFrag);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
//                tran.commit();
//                break;
//            case 1:
//                tran.replace(R.id.mainStramFrag, stampFrag2);  //replace의 매개변수는 (프래그먼트를 담을 영역 id, 프래그먼트 객체) 입니다.
//                tran.commit();
//                break;
//
//        }
//    }
//
//}