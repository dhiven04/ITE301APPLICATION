package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class Counselling extends AppCompatActivity {
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counselling);

        drawerLayout = findViewById(R.id.drawer_layout);
    }

    public void ClickMenu(View view){

        MainActivity3.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view){

        MainActivity3.closeDrawer(drawerLayout);
    }

    public void ClickHome(View view){

        MainActivity3.redirectActivity(this,MainActivity3.class);
    }

    public void ClickCounselling(View view){

        recreate();
    }

    public void ClickAboutUs(View view){

        MainActivity3.redirectActivity(this,AboutUs.class);

    }

    public void ClickContact(View view){

        MainActivity3.redirectActivity(this,Contact.class);
    }

    public void ClickLogout(View view){

        MainActivity3.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();

        MainActivity3.closeDrawer(drawerLayout);
    }
}