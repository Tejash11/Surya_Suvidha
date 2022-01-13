package com.example.suryasuvidha.activityclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.example.suryasuvidha.R;

public class tipsinfo extends AppCompatActivity {
    ImageView backbutton;
    int audit,dimswitch,refrigerator, heater, led;
    RelativeLayout tip1, tip2, tip3, tip4, tip5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsinfo);

        Intent i = getIntent();
        Bundle bundle = i.getBundleExtra("bundle");


        backbutton = findViewById(R.id.backbtn);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), billtips.class);
                i.putExtra("bundle", bundle);
                startActivity(i);
            }
        });

        audit = getIntent().getIntExtra("audit",0);
        refrigerator = getIntent().getIntExtra("refrigerator",0);
        heater = getIntent().getIntExtra("heater",0);
        dimswitch = getIntent().getIntExtra("dimswitch",0);
        led = getIntent().getIntExtra("led",0);

        tip1 = findViewById(R.id.tip1);
        tip2 = findViewById(R.id.tip2);
        tip3 = findViewById(R.id.tip3);
        tip4 = findViewById(R.id.tip4);
        tip5 = findViewById(R.id.tip5);

        if(audit==1 && refrigerator==0 && heater==0 && dimswitch==0 && led==0)
        {
            tip1.setVisibility(View.VISIBLE);
            tip2.setVisibility(View.GONE);
            tip3.setVisibility(View.GONE);
            tip4.setVisibility(View.GONE);
            tip5.setVisibility(View.GONE);
        }

        if(audit==0 && refrigerator==1 && heater==0 && dimswitch==0 && led==0)
        {
            tip1.setVisibility(View.GONE);
            tip2.setVisibility(View.VISIBLE);
            tip3.setVisibility(View.GONE);
            tip4.setVisibility(View.GONE);
            tip5.setVisibility(View.GONE);
        }

        if(audit==0 && refrigerator==0 && heater==1 && dimswitch==0 && led==0)
        {
            tip1.setVisibility(View.GONE);
            tip2.setVisibility(View.GONE);
            tip3.setVisibility(View.VISIBLE);
            tip4.setVisibility(View.GONE);
            tip5.setVisibility(View.GONE);
        }

        if(audit==0 && refrigerator==0 && heater==0 && dimswitch==1 && led==0)
        {
            tip1.setVisibility(View.GONE);
            tip2.setVisibility(View.GONE);
            tip3.setVisibility(View.GONE);
            tip4.setVisibility(View.VISIBLE);
            tip5.setVisibility(View.GONE);
        }

        if(audit==0 && refrigerator==0 && heater==0 && dimswitch==0 && led==1)
        {
            tip1.setVisibility(View.GONE);
            tip2.setVisibility(View.GONE);
            tip3.setVisibility(View.GONE);
            tip4.setVisibility(View.GONE);
            tip5.setVisibility(View.VISIBLE);
        }
    }
}