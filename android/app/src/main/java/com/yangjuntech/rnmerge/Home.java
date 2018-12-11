package com.yangjuntech.rnmerge;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

import java.util.List;

public class Home extends AppCompatActivity {
    private Fragment firstFragment;
    private Fragment secondFragment;
    private Fragment thirdFragment;
    private Fragment currentFragment;
    public BottomNavigationBar bottomNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initFragmentShow();

        bottomNavigationBar = (BottomNavigationBar) findViewById(R.id.bottom_navigation_bar);
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_nav_home,"main"))
                .addItem(new BottomNavigationItem(R.drawable.ic_nav_account,"second"))
                .addItem(new BottomNavigationItem(R.drawable.ic_nav_other,"third"))
                .setFirstSelectedPosition(0)
                .setActiveColor(R.color.colorPrimary)
                .setInActiveColor(R.color.colorPrimaryDark)
                .setBarBackgroundColor(R.color.white).initialise();
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();

                currentFragment=getVisibleFragment();
                if(firstFragment==null){//如果是第一次切换，则将初始页面设为homeFragment
                    firstFragment=currentFragment;
                }
                if(currentFragment != null){
                    transaction.hide(currentFragment);
                }
                switch (position){
                    case 0:
                        if(firstFragment==null){
                            firstFragment = new FirstFragment();
                            transaction.add(R.id.fragment_container,firstFragment);
                        }
                        transaction.show(firstFragment);
                        break;
                    case 1:
                        if(secondFragment==null){
                            secondFragment = new SecondFragment();
                            transaction.add(R.id.fragment_container,secondFragment);
                        }
                        transaction.show(secondFragment);
                        break;
                    case 2:
                        if(thirdFragment==null){
                            thirdFragment = new ThirdFragment();
                            transaction.add(R.id.fragment_container,thirdFragment);
                        }
                        transaction.show(thirdFragment);
                        break;
                    default:
                        break;
                }
                transaction.commit();
            }

            @Override
            public void onTabUnselected(int position) {

            }

            @Override
            public void onTabReselected(int position) {

            }
        });
    }

//    @Override
//    public boolean onKeyDown(int keyCode,KeyEvent event) {
//        if(keyCode == KeyEvent.KEYCODE_BACK) {
//            Intent intent = new Intent(Intent.ACTION_MAIN);
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            intent.addCategory(Intent.CATEGORY_HOME);
//            this.startActivity(intent);
//            return true;
//        }
//        return super.onKeyDown(keyCode,event);
//    }

    public Fragment getVisibleFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        List<Fragment> fragments = fragmentManager.getFragments();
        for(Fragment fragment : fragments){
            if(fragment != null && fragment.isVisible())
                return fragment;
        }
        return null;
    }

    public void initFragmentShow(){
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        firstFragment=new FirstFragment();
        transaction.add(R.id.fragment_container,firstFragment);
        transaction.commit();
    }
}
