package com.example.suryasuvidha.activityclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.suryasuvidha.R;
import com.example.suryasuvidha.fragmentclass.solar;

public class govn_scheme extends AppCompatActivity {
    LinearLayout scheme1, scheme2, scheme3, scheme4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_govn_scheme);

//        govnschemebackbutton = findViewById(R.id.govnschmbackbtn);
//        govnschemebackbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getBaseContext(), solar.class);
//                startActivity(i);
//            }
//        });

        scheme1 = findViewById(R.id.scheme1);
        scheme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.indiayojana.in/pm-kusum-yojana/"));
                startActivity(intent);
            }
        });

        scheme2 = findViewById(R.id.scheme2);
        scheme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uday.gov.in/about.php"));
                startActivity(intent);
            }
        });

        scheme3 = findViewById(R.id.scheme3);
        scheme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.seci.co.in/p"));
                startActivity(intent);
            }
        });

        scheme4 = findViewById(R.id.scheme4);
        scheme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mnre.gov.in/solar/schemes"));
                startActivity(intent);
            }
        });
    }
}