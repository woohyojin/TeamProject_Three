package com.example.othercock;

import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;

<<<<<<< Updated upstream
import com.example.othercock.Socket.service_Socket;
=======
import com.example.othercock.DTO.Manager;
import com.example.othercock.DTO.OrderMenu;
import com.example.othercock.DTO.PopulList;
import com.example.othercock.DTO.User;
import com.example.othercock.Socket.Protocol;
import com.example.othercock.Socket.service_Socket;
import com.example.othercock.ui.Login.LoginFragment;
import com.example.othercock.adapter.OnorderAdapter;
import com.example.othercock.ui.Login.SignupFragment;
import com.example.othercock.ui.coopone.CooponeFragment;
import com.example.othercock.ui.home.HomeFragment;
//import com.example.othercock.Socket.service_Socket;
>>>>>>> Stashed changes
import com.example.othercock.ui.Login.LoginFragment;
import com.example.othercock.adapter.OnorderAdapter;
import com.example.othercock.ui.menu.Detail_MenuFragment;
import com.example.othercock.ui.menu.MenuFragment;
import com.example.othercock.ui.other.OrderHistoryFragment;
import com.example.othercock.ui.other.OtherFragment;
import com.example.othercock.ui.store.StoreInfoFragment;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.othercock.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
<<<<<<< Updated upstream
    public String temp;
=======
    private static Context context;
    service_Socket socket;
    ImageView logout;
    View nav_headView;

    User user = new User();
    PopulList popul = new PopulList();
    OrderMenu menu = new OrderMenu();
    Manager manager = new Manager();


    private ArrayList<OrderMenu> orderMenuList = new ArrayList<OrderMenu>();
    private ArrayList<PopulList> populMenuList = new ArrayList<PopulList>();
    private ArrayList<Manager> marketList = new ArrayList<Manager>();


    boolean loginCheck = false;
>>>>>>> Stashed changes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//



        logout.setOnClickListener(onClick);

        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_rank, R.id.nav_othermain, R.id.nav_coopone, R.id.nav_menu, R.id.nav_store)
                .setOpenableLayout(drawer)
                .build();
<<<<<<< Updated upstream


        Fragment fragment = getFragmentManager().findFragmentById(R.id.nav_Login);



=======
>>>>>>> Stashed changes
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);

        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        Intent serviceIntent = new Intent(this, service_Socket.class);
        serviceIntent.putExtra("inputExtra", "Foreground Service Example in Android");
        ContextCompat.startForegroundService(this, serviceIntent);





    }
    public void  testFragment(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.nav_host_fragment_content_main, new OrderHistoryFragment());
        ft.addToBackStack(null);
        ft.commit();
    }
    public  void Ditailmenu(String title){
        temp = title;
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.nav_host_fragment_content_main, new Detail_MenuFragment());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void  testFragment2(){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.nav_host_fragment_content_main, new MenuFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    @Override
    public void onResume() {
        super.onResume();
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver,
                new IntentFilter("naminsik"));
    }
    private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra("pw");
            //CallYourMethod(message); 실행시킬 메소드를 전달 받은 데이터를 담아 호출하려면 이렇게 한다.
            System.out.println(message);
        }
    };
    @Override
    protected void onPause() {
        LocalBroadcastManager.getInstance(this).unregisterReceiver(mMessageReceiver);
        super.onPause();
    }
<<<<<<< Updated upstream
    public String getTemp(){
        return temp;
=======
    public static Context ApplicationContext(){
        return context;
    }

    class OnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            if (view.getId() == R.id.side_logout) {
                loginCheck = false;
                Intent intent = new Intent(context, service_Socket.class);
                intent.putExtra("pw", Protocol.LOGOUT + "|" + "logout");
                context.startService(intent);
            }
        }
    }

    // ===================> 플래그먼트 컨트롤 <===================
    public void fragmentOrder() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new OtherFragment());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void fragmentStar() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new FavoriteMenuFragment());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void fragmentCoopone() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new CooponeFragment());
        ft.addToBackStack(null);
        ft.commit();
    }
    public void fragmentStore() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new StoreInfoFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void fragmentOrderHistory() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new OrderHistoryFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void fragmentMenuFragment() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.nav_host_fragment_content_main, new MenuFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void fragmentSignUp() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new SignupFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void fragmentSignIn() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new LoginFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    public void fragmentMain() {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction(); // 이거 전역으로빼면 오류납니다
        ft.replace(R.id.nav_host_fragment_content_main, new HomeFragment());
        ft.addToBackStack(null);
        ft.commit();
    }

    // ===============> 데이터체크 <===============
    public boolean loginCheck() {
        return loginCheck;
    }

    public void loginCheckChange() {
        loginCheck = true;
        fragmentMain();
>>>>>>> Stashed changes
    }
}