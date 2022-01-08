package com.example.suryasuvidha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class checkyourbill extends AppCompatActivity {

    ImageView viewbillbackbutton;
    LinearLayout uppclcard, kanpurcard, noidacard, torrentcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkyourbill);

        viewbillbackbutton = findViewById(R.id.viewbillbackbtn);
        viewbillbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                startActivity(i);
            }
        });

        uppclcard = findViewById(R.id.uppclcard);
        uppclcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.uppclonline.com/dispatch/Portal/appmanager/uppcl/wss%3F_nfpb%3Dtrue%26_pageLabel%3Duppcl_billInfo_payBill_home%26pageID%3DPB_1010"));
                startActivity(intent);
            }
        });

        kanpurcard = findViewById(R.id.kanpurcard);
        kanpurcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://kesco.co.in/wss/Consumer_Data.htm"));
                startActivity(intent);
            }
        });

        noidacard = findViewById(R.id.noidacard);
        noidacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.noidapower.com/"));
                startActivity(intent);
            }
        });

        torrentcard = findViewById(R.id.torrentcard);
        torrentcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.torrentpower.com/index.php/site/indexs"));
                startActivity(intent);
            }
        });
    }
}