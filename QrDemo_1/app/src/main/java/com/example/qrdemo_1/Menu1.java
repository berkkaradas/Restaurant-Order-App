package com.example.qrdemo_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class Menu1 extends AppCompatActivity {

    //tanımlar

    private TabLayout tablayout;
    private ViewPager viewpager;
    private TabItem tabYiyecek,tabIcecek,tabTatli;
    public PageAdapter pagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        //tanımlar

        tablayout =(TabLayout)findViewById(R.id.tablayout);
        tabYiyecek=(TabItem)findViewById(R.id.tabYiyecek);
        tabIcecek=(TabItem)findViewById(R.id.tabIcecek);
        tabTatli=(TabItem)findViewById(R.id.tabTatli);
        viewpager=findViewById(R.id.viewpager);

        //swipe and click işlemleri

        pagerAdapter=new PageAdapter(getSupportFragmentManager(),tablayout.getTabCount());
        viewpager.setAdapter(pagerAdapter);

        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                                               @Override
                                               public void onTabSelected(TabLayout.Tab tab) {
                                                   viewpager.setCurrentItem(tab.getPosition());
                                                   if(tab.getPosition()==0){
                                                       pagerAdapter.notifyDataSetChanged();
                                                   }
                                                   else if (tab.getPosition()==1) {
                                                       pagerAdapter.notifyDataSetChanged();
                                                   }
                                                   else if (tab.getPosition()==2) {
                                                       pagerAdapter.notifyDataSetChanged();
                                                   }

                                               }

                                               @Override
                                               public void onTabUnselected(TabLayout.Tab tab) {

                                               }

                                               @Override
                                               public void onTabReselected(TabLayout.Tab tab) {

                                               }
                                           }
        );

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));









    }
}

