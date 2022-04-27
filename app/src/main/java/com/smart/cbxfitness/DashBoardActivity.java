package com.smart.cbxfitness;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.smart.cbxfitness.Fragment.DiscoverFragment;
import com.smart.cbxfitness.Fragment.PersonalFragment;
import com.smart.cbxfitness.Fragment.ProfileFragment;

public class DashBoardActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;
    ProfileFragment firstFragment = new ProfileFragment();
    DiscoverFragment discoverFragment = new DiscoverFragment();
    PersonalFragment personalFragment = new PersonalFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
       // BottomNavigationMenuView menuView = (BottomNavigationMenuView) bottomNavigationView.getChildAt(0);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home);
       /* final View iconView =
                menuView.getChildAt(1).findViewById(R.id.home);
        iconView.setScaleY(2.5f);
        iconView.setScaleX(2.5f);*/

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.person:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment,discoverFragment ).commit();
                return true;

            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();
                return true;

            case R.id.settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, personalFragment).commit();
                return true;
        }
        return false;
    }
}