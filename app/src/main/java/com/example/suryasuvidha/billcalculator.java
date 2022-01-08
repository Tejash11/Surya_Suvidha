package com.example.suryasuvidha;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link billcalculator#newInstance} factory method to
 * create an instance of this fragment.
 */
public class billcalculator extends Fragment {
    int totalbill, ac , ref, heater, light, fan , washing = 0;
    ImageView backbutton;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public billcalculator() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment billcalculator.
     */
    // TODO: Rename and change types and number of parameters
    public static billcalculator newInstance(String param1, String param2) {
        billcalculator fragment = new billcalculator();
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
        View view =  inflater.inflate(R.layout.fragment_billcalculator, container, false);

        backbutton = (ImageView) view.findViewById(R.id.totalbillbackbtn);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new home();
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });

        Bundle bundle = new Bundle();

        LinearLayout totalbillcard = (LinearLayout) view.findViewById(R.id.totalbillcard);
        totalbillcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalbill = 1;
                ac = 0;
                ref = 0;
                heater = 0;
                light = 0;
                washing = 0;
                fan = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });


        LinearLayout accard = (LinearLayout) view.findViewById(R.id.accard);
        accard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ac = 1;
                totalbill = 0;
                ref = 0;
                heater = 0;
                light = 0;
                washing = 0;
                fan = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });

        LinearLayout refricard = (LinearLayout) view.findViewById(R.id.refricard);
        refricard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref = 1;
                totalbill = 0;
                ac = 0;
                heater = 0;
                light = 0;
                washing = 0;
                fan = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });

        LinearLayout waterheater = (LinearLayout) view.findViewById(R.id.waterheatercard);
        waterheater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heater = 1;
                totalbill = 0;
                ac = 0;
                ref = 0;
                light = 0;
                washing = 0;
                fan = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });

        LinearLayout lightcard = (LinearLayout) view.findViewById(R.id.lightcard);
        lightcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                light = 1;
                totalbill = 0;
                ac = 0;
                heater = 0;
                ref = 0;
                washing = 0;
                fan = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });

        LinearLayout washcard = (LinearLayout) view.findViewById(R.id.washingmachinecard);
        washcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                washing = 1;
                totalbill = 0;
                ac = 0;
                heater = 0;
                light = 0;
                ref = 0;
                fan = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });

        LinearLayout fancad = (LinearLayout) view.findViewById(R.id.fancard);
        fancad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fan = 1;
                totalbill = 0;
                ac = 0;
                heater = 0;
                light = 0;
                washing = 0;
                ref = 0;

                bundle.putInt("ac", ac);
                bundle.putInt("ref", ref);
                bundle.putInt("heater", heater);
                bundle.putInt("light", light);
                bundle.putInt("washing", washing);
                bundle.putInt("fan", fan);
                bundle.putInt("totalbill", totalbill);

                FragmentManager m = getActivity().getSupportFragmentManager();
                FragmentTransaction t = m.beginTransaction();
                Fragment calculatingfrag = new calculatingbill();
                calculatingfrag.setArguments(bundle);
                t.replace(R.id.fragment, calculatingfrag);
                t.addToBackStack(null);
                t.commit();
            }
        });


        return view;
    }
}