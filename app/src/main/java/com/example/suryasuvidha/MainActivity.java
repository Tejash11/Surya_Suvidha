package com.example.suryasuvidha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView homebtn, solarbtn, windbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //pager = findViewById(R.id.viewpager);
        homebtn = (ImageView) findViewById(R.id.homebtn);
        solarbtn = (ImageView) findViewById(R.id.solarbtn);
        windbtn = (ImageView) findViewById(R.id.windbtn);

        homebtn.setImageResource(R.drawable.colorhome);
        FragmentManager m = getSupportFragmentManager();
        FragmentTransaction t = m.beginTransaction();
        Fragment Home = new home();
        t.replace(R.id.fragment, Home);
        t.commit();

//        homebtn.setOnClickListener(new View.OnClickListener() {
        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("bundle");



//        ImageView solarbtn = (ImageView) findViewById(R.id.solarbtn);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solarbtn.setImageResource(R.drawable.sunfill);
                homebtn.setImageResource(R.drawable.colorhome);
                windbtn.setImageResource(R.drawable.windmill);
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment home = new home();
                home.setArguments(bundle);
                t.replace(R.id.fragment, home);
                t.commit();
            }
        });


        /*solarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solarbtn.setImageResource(R.drawable.sunimg);
                homebtn.setImageResource(R.drawable.homepageoutline);
                windbtn.setImageResource(R.drawable.windmill);
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment solar = new solar();
                solar.setArguments(bundle);
                t.replace(R.id.fragment, solar);
                t.commit();
            }
        });*/

       /* windbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windbtn.setImageResource(R.drawable.windimg);
                solarbtn.setImageResource(R.drawable.sunfill);
                homebtn.setImageResource(R.drawable.homepageoutline);
                FragmentManager m = getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment solar = new solar();
                t.replace(R.id.fragment, solar);
                t.commit();
            }
        });*/
    }
}