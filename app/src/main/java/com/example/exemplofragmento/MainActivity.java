package com.example.exemplofragmento;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1 = actionbar.newTab().setText("Frag1");
        tab1.setTabListener(new MyTabListener(this,new fragmento1()));
        actionbar.addTab(tab1);

        ActionBar.Tab tab2 = actionbar.newTab().setText("Frag2");
        tab2.setTabListener(new MyTabListener(this,new fragmento2()));
        actionbar.addTab(tab2);
    }

}