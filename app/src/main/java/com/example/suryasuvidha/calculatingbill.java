package com.example.suryasuvidha;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link calculatingbill#newInstance} factory method to
 * create an instance of this fragment.
 */
public class calculatingbill extends Fragment {
    RelativeLayout overallbilling, airconditioner, refrigerator, waterheater, lightbulb, washingmachine, ceilingfan;
    int totalbill, ac , ref, heater, light, fan , washing = 0;
    ImageView totalbillbackbutton;
    TextView calculateacbutton, calculateacamount,
            calculaterefbutton, calculaterefamount,
            calculateheaterbutton, calculateheateramount,
            calculatelightbutton, calculatelightamount,
            calculatefanbutton, calculatefanamount,
            calculatewashingbutton, calculatewashingamount,
            calculatetotalbillbutton, calculatetotalbillamount;

    EditText acpower, acquantity, acdailyusage, acprice, acduration,
            refpower, refquantity, refdailyusage, refprice, refduration,
            heaterpower, heaterquantity, heaterdailyusage, heaterprice, heaterduration,
            lightpower, lightquantity, lightdailyusage, lightprice, lightduration,
            fanpower, fanquantity, fandailyusage, fanprice, fanduration,
            washingpower, washingquantity, washingdailyusage, washingprice, washingduration,

    totalbillacpower, totalbillacquantity, totalbillacdailyusage,
            totalbillrefpower, totalbillrefquantity, totalbillrefdailyusage,
            totalbillheaterpower, totalbillheaterquantity, totalbillheaterdailyusage,
            totalbilllightpower, totalbilllightquantity, totalbilllightdailyusage,
            totalbillfanpower, totalbillfanquantity, totalbillfandailyusage,
            totalbillwashingpower, totalbillwashingquantity, totalbillwashingdailyusage,
            totalbillprice, totalbillduration;


    long bill;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public calculatingbill() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment calculatingbill.
     */
    // TODO: Rename and change types and number of parameters
    public static calculatingbill newInstance(String param1, String param2) {
        calculatingbill fragment = new calculatingbill();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_calculatingbill, container, false);

        Bundle bundle = this.getArguments();
        ac = bundle.getInt("ac");
        ref = bundle.getInt("ref");
        heater = bundle.getInt("heater");
        light = bundle.getInt("light");
        washing = bundle.getInt("washing");
        fan = bundle.getInt("fan");
        totalbill = bundle.getInt("totalbill");

        totalbillbackbutton = (ImageView) view.findViewById(R.id.totalbillbackbtn);

        overallbilling = (RelativeLayout) view.findViewById(R.id.overallbillingcard);
        airconditioner = (RelativeLayout) view.findViewById(R.id.airconditionercard);
        refrigerator = (RelativeLayout) view.findViewById(R.id.refrigeratorcard);
        waterheater = (RelativeLayout) view.findViewById(R.id.heatercard);
        lightbulb = (RelativeLayout) view.findViewById(R.id.lightcard);
        washingmachine = (RelativeLayout) view.findViewById(R.id.washingmachinecard);
        ceilingfan = (RelativeLayout) view.findViewById(R.id.fancard);

        calculateacbutton = (TextView) view.findViewById(R.id.calculateacbtn);
        calculateacamount = (TextView) view.findViewById(R.id.calculateacamount);

        calculaterefbutton = (TextView) view.findViewById(R.id.calculaterefbtn);
        calculaterefamount = (TextView) view.findViewById(R.id.calculaterefamount);

        calculateheaterbutton = (TextView) view.findViewById(R.id.calculateheaterbtn);
        calculateheateramount = (TextView) view.findViewById(R.id.calculateheateramount);

        calculatelightbutton = (TextView) view.findViewById(R.id.calculatelightbtn);
        calculatelightamount = (TextView) view.findViewById(R.id.calculatelightamount);

        calculatefanbutton = (TextView) view.findViewById(R.id.calculatefanbtn);
        calculatefanamount = (TextView) view.findViewById(R.id.calculatefanamount);

        calculatewashingbutton = (TextView) view.findViewById(R.id.calculatewashingbtn);
        calculatewashingamount = (TextView) view.findViewById(R.id.calculatewashingamount);

        calculatetotalbillbutton = (TextView) view.findViewById(R.id.calculatetotalbillbtn);
        calculatetotalbillamount = (TextView) view.findViewById(R.id.calculatetotalbillamount);

        acpower = (EditText) view.findViewById(R.id.acpower);
        acquantity = (EditText) view.findViewById(R.id.acquantity);
        acdailyusage = (EditText) view.findViewById(R.id.acdailyusage);
        acprice = (EditText) view.findViewById(R.id.acprice);
        acduration = (EditText) view.findViewById(R.id.acduration);

        refpower = (EditText) view.findViewById(R.id.refpower);
        refquantity = (EditText) view.findViewById(R.id.refquantity);
        refdailyusage = (EditText) view.findViewById(R.id.refdailyusage);
        refprice = (EditText) view.findViewById(R.id.refprice);
        refduration = (EditText) view.findViewById(R.id.refduration);

        heaterpower = (EditText) view.findViewById(R.id.heaterpower);
        heaterquantity = (EditText) view.findViewById(R.id.heaterquantity);
        heaterdailyusage = (EditText) view.findViewById(R.id.heaterdailyusage);
        heaterprice = (EditText) view.findViewById(R.id.heaterprice);
        heaterduration = (EditText) view.findViewById(R.id.heaterduration);

        lightpower = (EditText) view.findViewById(R.id.lightpower);
        lightquantity = (EditText) view.findViewById(R.id.lightquantity);
        lightdailyusage = (EditText) view.findViewById(R.id.lightdailyusage);
        lightprice = (EditText) view.findViewById(R.id.lightprice);
        lightduration = (EditText) view.findViewById(R.id.lightduration);

        fanpower = (EditText) view.findViewById(R.id.fanpower);
        fanquantity = (EditText) view.findViewById(R.id.fanquantity);
        fandailyusage = (EditText) view.findViewById(R.id.fandailyusage);
        fanprice = (EditText) view.findViewById(R.id.fanprice);
        fanduration = (EditText) view.findViewById(R.id.fanduration);

        washingpower = (EditText) view.findViewById(R.id.washingpower);
        washingquantity = (EditText) view.findViewById(R.id.washingquantity);
        washingdailyusage = (EditText) view.findViewById(R.id.washingdailyusage);
        washingprice = (EditText) view.findViewById(R.id.washingprice);
        washingduration = (EditText) view.findViewById(R.id.washingduration);


        totalbillacpower = (EditText) view.findViewById(R.id.totalbillacpower);
        totalbillacquantity = (EditText) view.findViewById(R.id.totalbillacquantity);
        totalbillacdailyusage = (EditText) view.findViewById(R.id.totalbillacdailyusage);

        totalbillrefpower = (EditText) view.findViewById(R.id.totalbillrefpower);
        totalbillrefquantity = (EditText) view.findViewById(R.id.totalbillrefquantity);
        totalbillrefdailyusage = (EditText) view.findViewById(R.id.totalbillrefdailyusage);

        totalbillheaterpower = (EditText) view.findViewById(R.id.totalbillheaterpower);
        totalbillheaterquantity = (EditText) view.findViewById(R.id.totalbillheaterquantity);
        totalbillheaterdailyusage = (EditText) view.findViewById(R.id.totalbillheaterdailyusage);

        totalbilllightpower = (EditText) view.findViewById(R.id.totalbilllightpower);
        totalbilllightquantity = (EditText) view.findViewById(R.id.totalbilllightquantity);
        totalbilllightdailyusage = (EditText) view.findViewById(R.id.totalbilllightdailyusage);

        totalbillfanpower = (EditText) view.findViewById(R.id.totalbillfanpower);
        totalbillfanquantity = (EditText) view.findViewById(R.id.totalbillfanquantity);
        totalbillfandailyusage = (EditText) view.findViewById(R.id.totalbillfandailyusage);

        totalbillwashingpower = (EditText) view.findViewById(R.id.totalbillwashingpower);
        totalbillwashingquantity = (EditText) view.findViewById(R.id.totalbillwashingquantity);
        totalbillwashingdailyusage = (EditText) view.findViewById(R.id.totalbillwashingdailyusage);

        totalbillprice = (EditText) view.findViewById(R.id.totalbillprice);
        totalbillduration = (EditText) view.findViewById(R.id.totalbillduration);

        totalbillbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new billcalculator();
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });


        if(totalbill == 1 && ac == 0 && ref == 0 && heater == 0 && light == 0 && washing == 0 && fan == 0)
        {
            overallbilling.setVisibility(View.VISIBLE);
            airconditioner.setVisibility(View.GONE);
            refrigerator.setVisibility(View.GONE);
            waterheater.setVisibility(View.GONE);
            lightbulb.setVisibility(View.GONE);
            washingmachine.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.GONE);

            calculatetotalbillbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String totalacpower = String.valueOf(totalbillacpower.getText());
                    String totalacquantity = String.valueOf(totalbillacquantity.getText());
                    String totalacdailyusage = String.valueOf(totalbillacdailyusage.getText());

                    String totalrefpower = String.valueOf(totalbillrefpower.getText());
                    String totalrefquantity = String.valueOf(totalbillrefquantity.getText());
                    String totalrefdailyusage = String.valueOf(totalbillrefdailyusage.getText());

                    String totalheaterpower = String.valueOf(totalbillheaterpower.getText());
                    String totalheaterquantity = String.valueOf(totalbillheaterquantity.getText());
                    String totalheaterdailyusage = String.valueOf(totalbillheaterdailyusage.getText());

                    String totallightpower = String.valueOf(totalbilllightpower.getText());
                    String totallightquantity = String.valueOf(totalbilllightquantity.getText());
                    String totallightdailyusage = String.valueOf(totalbilllightdailyusage.getText());

                    String totalfanpower = String.valueOf(totalbillfanpower.getText());
                    String totalfanquantity = String.valueOf(totalbillfanquantity.getText());
                    String totalfandailyusage = String.valueOf(totalbillfandailyusage.getText());

                    String totalwashingpower = String.valueOf(totalbillwashingpower.getText());
                    String totalwashingquantity = String.valueOf(totalbillwashingquantity.getText());
                    String totalwashingdailyusage = String.valueOf(totalbillwashingdailyusage.getText());


                    String totalbillsprice = String.valueOf(totalbillprice.getText());
                    String totalbillsduration = String.valueOf(totalbillduration.getText());

                    if(totalacpower.trim().isEmpty() && totalacquantity.trim().isEmpty() && totalacdailyusage.trim().isEmpty() &&
                            totalrefpower.trim().isEmpty() && totalrefquantity.trim().isEmpty() && totalrefdailyusage.trim().isEmpty() &&
                            totalheaterpower.trim().isEmpty() && totalheaterquantity.trim().isEmpty() && totalheaterdailyusage.trim().isEmpty() &&
                            totallightpower.trim().isEmpty() && totallightquantity.trim().isEmpty() && totallightdailyusage.trim().isEmpty() &&
                            totalfanpower.trim().isEmpty() && totalfanquantity.trim().isEmpty() && totalfandailyusage.trim().isEmpty() &&
                            totalwashingpower.trim().isEmpty() && totalwashingquantity.trim().isEmpty() && totalwashingdailyusage.trim().isEmpty() &&
                            totalbillsprice.trim().isEmpty() && totalbillsduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getacpower = Long.parseLong(totalbillacpower.getText().toString().trim());
                        long getacquantity = Long.parseLong(totalbillacquantity.getText().toString().trim());
                        long getacdailyusage = Long.parseLong(totalbillacdailyusage.getText().toString().trim());

                        long getrefpower = Long.parseLong(totalbillrefpower.getText().toString().trim());
                        long getrefquantity = Long.parseLong(totalbillrefquantity.getText().toString().trim());
                        long getrefdailyusage = Long.parseLong(totalbillrefdailyusage.getText().toString().trim());

                        long getheaterpower = Long.parseLong(totalbillheaterpower.getText().toString().trim());
                        long getheaterquantity = Long.parseLong(totalbillheaterquantity.getText().toString().trim());
                        long getheaterdailyusage = Long.parseLong(totalbillheaterdailyusage.getText().toString().trim());

                        long getlightpower = Long.parseLong(totalbilllightpower.getText().toString().trim());
                        long getlightquantity = Long.parseLong(totalbilllightquantity.getText().toString().trim());
                        long getlightdailyusage = Long.parseLong(totalbilllightdailyusage.getText().toString().trim());

                        long getfanpower = Long.parseLong(totalbillfanpower.getText().toString().trim());
                        long getfanquantity = Long.parseLong(totalbillfanquantity.getText().toString().trim());
                        long getfandailyusage = Long.parseLong(totalbillfandailyusage.getText().toString().trim());

                        long getwashingpower = Long.parseLong(totalbillwashingpower.getText().toString().trim());
                        long getwashingquantity = Long.parseLong(totalbillwashingquantity.getText().toString().trim());
                        long getwashingdailyusage = Long.parseLong(totalbillwashingdailyusage.getText().toString().trim());

                        long gettotalbillprice = Long.parseLong(totalbillprice.getText().toString().trim());
                        long gettotalbillduration = Long.parseLong(totalbillduration.getText().toString().trim());

                        calculationoftotalbill(getacpower, getacquantity, getacdailyusage, getrefpower, getrefquantity, getrefdailyusage, getheaterpower, getheaterquantity, getheaterdailyusage, getlightpower, getlightquantity, getlightdailyusage, getfanpower, getfanquantity, getfandailyusage, getwashingpower, getwashingquantity, getwashingdailyusage, gettotalbillprice, gettotalbillduration);
                    }
                }
            });
        }

        else if(totalbill == 0 && ac == 1 && ref == 0 && heater == 0 && light == 0 && washing == 0 && fan == 0)
        {
            airconditioner.setVisibility(View.VISIBLE);
            refrigerator.setVisibility(View.GONE);
            waterheater.setVisibility(View.GONE);
            lightbulb.setVisibility(View.GONE);
            washingmachine.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.GONE);

            calculateacbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String edittextpower = String.valueOf(acpower.getText());
                    String edittextquantity = String.valueOf(acquantity.getText());
                    String edittextdailyusage = String.valueOf(acdailyusage.getText());
                    String edittextprice = String.valueOf(acprice.getText());
                    String edittextduration = String.valueOf(acduration.getText());

                    if(edittextpower.trim().isEmpty() || edittextquantity.trim().isEmpty() || edittextdailyusage.trim().isEmpty() || edittextprice.trim().isEmpty() || edittextduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getpower = Long.parseLong(acpower.getText().toString().trim());
                        long getquantity = Long.parseLong(acquantity.getText().toString().trim());
                        long getdailyusage = Long.parseLong(acdailyusage.getText().toString().trim());
                        long getprice = Long.parseLong(acprice.getText().toString().trim());
                        long getduration = Long.parseLong(acduration.getText().toString().trim());

                        calculationofacbill(getpower,getquantity,getdailyusage,getprice,getduration);
                    }
                }
            });
        }
        else if(totalbill == 0 && ac == 0 && ref == 1 && heater == 0 && light == 0 && washing == 0 && fan == 0)
        {
            airconditioner.setVisibility(View.GONE);
            refrigerator.setVisibility(View.VISIBLE);
            waterheater.setVisibility(View.GONE);
            lightbulb.setVisibility(View.GONE);
            washingmachine.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.GONE);

            calculaterefbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String edittextpower = String.valueOf(refpower.getText());
                    String edittextquantity = String.valueOf(refquantity.getText());
                    String edittextdailyusage = String.valueOf(refdailyusage.getText());
                    String edittextprice = String.valueOf(refprice.getText());
                    String edittextduration = String.valueOf(refduration.getText());

                    if(edittextpower.trim().isEmpty() && edittextquantity.trim().isEmpty() && edittextdailyusage.trim().isEmpty() && edittextprice.trim().isEmpty() && edittextduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getpower = Long.parseLong(refpower.getText().toString().trim());
                        long getquantity = Long.parseLong(refquantity.getText().toString().trim());
                        long getdailyusage = Long.parseLong(refdailyusage.getText().toString().trim());
                        long getprice = Long.parseLong(refprice.getText().toString().trim());
                        long getduration = Long.parseLong(refduration.getText().toString().trim());

                        calculationofrefbill(getpower,getquantity,getdailyusage,getprice,getduration);
                    }
                }
            });
        }
        else if(totalbill == 0 && ac == 0 && ref == 0 && heater == 1 && light == 0 && washing == 0 && fan == 0)
        {
            airconditioner.setVisibility(View.GONE);
            refrigerator.setVisibility(View.GONE);
            waterheater.setVisibility(View.VISIBLE);
            lightbulb.setVisibility(View.GONE);
            washingmachine.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.GONE);

            calculateheaterbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String edittextpower = String.valueOf(heaterpower.getText());
                    String edittextquantity = String.valueOf(heaterquantity.getText());
                    String edittextdailyusage = String.valueOf(heaterdailyusage.getText());
                    String edittextprice = String.valueOf(heaterprice.getText());
                    String edittextduration = String.valueOf(heaterduration.getText());

                    if(edittextpower.trim().isEmpty() && edittextquantity.trim().isEmpty() && edittextdailyusage.trim().isEmpty() && edittextprice.trim().isEmpty() && edittextduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getpower = Long.parseLong(heaterpower.getText().toString().trim());
                        long getquantity = Long.parseLong(heaterquantity.getText().toString().trim());
                        long getdailyusage = Long.parseLong(heaterdailyusage.getText().toString().trim());
                        long getprice = Long.parseLong(heaterprice.getText().toString().trim());
                        long getduration = Long.parseLong(heaterduration.getText().toString().trim());

                        calculationofheaterbill(getpower,getquantity,getdailyusage,getprice,getduration);
                    }
                }
            });
        }
        else if(totalbill == 0 && ac == 0 && ref == 0 && heater == 0 && light == 1 && washing == 0 && fan == 0)
        {
            airconditioner.setVisibility(View.GONE);
            refrigerator.setVisibility(View.GONE);
            waterheater.setVisibility(View.GONE);
            lightbulb.setVisibility(View.VISIBLE);
            washingmachine.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.GONE);

            calculatelightbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String edittextpower = String.valueOf(lightpower.getText());
                    String edittextquantity = String.valueOf(lightquantity.getText());
                    String edittextdailyusage = String.valueOf(lightdailyusage.getText());
                    String edittextprice = String.valueOf(lightprice.getText());
                    String edittextduration = String.valueOf(lightduration.getText());

                    if(edittextpower.trim().isEmpty() && edittextquantity.trim().isEmpty() && edittextdailyusage.trim().isEmpty() && edittextprice.trim().isEmpty() && edittextduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getpower = Long.parseLong(lightpower.getText().toString().trim());
                        long getquantity = Long.parseLong(lightquantity.getText().toString().trim());
                        long getdailyusage = Long.parseLong(lightdailyusage.getText().toString().trim());
                        long getprice = Long.parseLong(lightprice.getText().toString().trim());
                        long getduration = Long.parseLong(lightduration.getText().toString().trim());

                        calculationoflightbill(getpower,getquantity,getdailyusage,getprice,getduration);
                    }
                }
            });
        }
        else if(totalbill == 0 && ac == 0 && ref == 0 && heater == 0 && light == 0 && fan == 1 && washing == 0)
        {
            airconditioner.setVisibility(View.GONE);
            refrigerator.setVisibility(View.GONE);
            waterheater.setVisibility(View.GONE);
            lightbulb.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.VISIBLE);
            washingmachine.setVisibility(View.GONE);

            calculatefanbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String edittextpower = String.valueOf(fanpower.getText());
                    String edittextquantity = String.valueOf(fanquantity.getText());
                    String edittextdailyusage = String.valueOf(fandailyusage.getText());
                    String edittextprice = String.valueOf(fanprice.getText());
                    String edittextduration = String.valueOf(fanduration.getText());

                    if(edittextpower.trim().isEmpty() && edittextquantity.trim().isEmpty() && edittextdailyusage.trim().isEmpty() && edittextprice.trim().isEmpty() && edittextduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getpower = Long.parseLong(fanpower.getText().toString().trim());
                        long getquantity = Long.parseLong(fanquantity.getText().toString().trim());
                        long getdailyusage = Long.parseLong(fandailyusage.getText().toString().trim());
                        long getprice = Long.parseLong(fanprice.getText().toString().trim());
                        long getduration = Long.parseLong(fanduration.getText().toString().trim());

                        calculationoffanbill(getpower,getquantity,getdailyusage,getprice,getduration);
                    }
                }
            });
        }
        else
        {
            airconditioner.setVisibility(View.GONE);
            refrigerator.setVisibility(View.GONE);
            waterheater.setVisibility(View.GONE);
            lightbulb.setVisibility(View.GONE);
            ceilingfan.setVisibility(View.GONE);
            washingmachine.setVisibility(View.VISIBLE);

            calculatewashingbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String edittextpower = String.valueOf(washingpower.getText());
                    String edittextquantity = String.valueOf(washingquantity.getText());
                    String edittextdailyusage = String.valueOf(washingdailyusage.getText());
                    String edittextprice = String.valueOf(washingprice.getText());
                    String edittextduration = String.valueOf(washingduration.getText());

                    if(edittextpower.trim().isEmpty() && edittextquantity.trim().isEmpty() && edittextdailyusage.trim().isEmpty() && edittextprice.trim().isEmpty() && edittextduration.trim().isEmpty())
                    {
                        Toast.makeText(getActivity(),"Please fill all inputs", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        long getpower = Long.parseLong(washingpower.getText().toString().trim());
                        long getquantity = Long.parseLong(washingquantity.getText().toString().trim());
                        long getdailyusage = Long.parseLong(washingdailyusage.getText().toString().trim());
                        long getprice = Long.parseLong(washingprice.getText().toString().trim());
                        long getduration = Long.parseLong(washingduration.getText().toString().trim());

                        calculationofwashingbill(getpower,getquantity,getdailyusage,getprice,getduration);
                    }
                }
            });
        }
        return view;
    }

    private void calculationoftotalbill(long getacpower, long getacquantity, long getacdailyusage, long getrefpower, long getrefquantity, long getrefdailyusage, long getheaterpower, long getheaterquantity, long getheaterdailyusage, long getlightpower, long getlightquantity, long getlightdailyusage, long getfanpower, long getfanquantity, long getfandailyusage, long getwashingpower, long getwashingquantity, long getwashingdailyusage, long gettotalbillprice, long gettotalbillduration)
    {
        bill = (((getacpower*getacquantity*getacdailyusage)+
                (getrefpower*getrefquantity*getrefdailyusage)+
                (getheaterpower*getheaterquantity*getheaterdailyusage)+
                (getlightpower*getlightquantity*getlightdailyusage)+
                (getfanpower*getfanquantity*getfandailyusage)+
                (getwashingpower*getwashingquantity*getwashingdailyusage))*gettotalbillprice*gettotalbillduration)/1000;

        calculatetotalbillamount.setText("The Total Electricity Bill Amount is = ₹ "+(int)bill+"/-");

    }


    private void calculationofacbill(long getpower, long getquantity, long getdailyusage, long getprice, long getduration)
    {
        bill = (getpower * getquantity * getdailyusage * getprice * getduration)/1000;
        calculateacamount.setText("The A.C. Bill Amount is = ₹ "+(int)bill+"/-");
    }

    private void calculationofrefbill(long getpower, long getquantity, long getdailyusage, long getprice, long getduration)
    {
        bill = (getpower * getquantity * getdailyusage * getprice * getduration)/1000;
        calculaterefamount.setText("The Refrigerator Bill Amount is = ₹ "+(int)bill+"/-");
    }

    private void calculationofheaterbill(long getpower, long getquantity, long getdailyusage, long getprice, long getduration)
    {
        bill = (getpower * getquantity * getdailyusage * getprice * getduration)/1000;
        calculateheateramount.setText("The Heater Bill Amount is = ₹ "+(int)bill+"/-");
    }

    private void calculationoflightbill(long getpower, long getquantity, long getdailyusage, long getprice, long getduration)
    {
        bill = (getpower * getquantity * getdailyusage * getprice * getduration)/1000;
        calculatelightamount.setText("The Light Bill Amount is = ₹ "+(int)bill+"/-");
    }

    private void calculationoffanbill(long getpower, long getquantity, long getdailyusage, long getprice, long getduration)
    {
        bill = (getpower * getquantity * getdailyusage * getprice * getduration)/1000;
        calculatefanamount.setText("The Fan Bill Amount is = ₹ "+(int)bill+"/-");
    }

    private void calculationofwashingbill(long getpower, long getquantity, long getdailyusage, long getprice, long getduration)
    {
        bill = (getpower * getquantity * getdailyusage * getprice * getduration)/1000;
        calculatewashingamount.setText("The Washing Machine Bill Amount is = ₹ "+(int)bill+"/-");
    }
}