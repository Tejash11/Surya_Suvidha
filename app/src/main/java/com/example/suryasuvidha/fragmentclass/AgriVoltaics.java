package com.example.suryasuvidha.fragmentclass;

import android.graphics.Color;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.suryasuvidha.R;
import com.example.suryasuvidha.customadapters.crop_custom_adapter;
import com.example.suryasuvidha.modelclass.cropmodel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AgriVoltaics#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AgriVoltaics extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public crop_custom_adapter myadapter;
    public AgriVoltaics() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AgriVoltaics.
     */
    // TODO: Rename and change types and number of parameters
    public static AgriVoltaics newInstance(String param1, String param2) {
        AgriVoltaics fragment = new AgriVoltaics();
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
        View v  = inflater.inflate(R.layout.fragment_agri_voltaics, container, false);

        TextView inter = (TextView) v.findViewById(R.id.interspace);
        TextView below = (TextView) v.findViewById(R.id.belowpanels);
        ImageView descript = (ImageView) v.findViewById(R.id.descript);

        RecyclerView croprecycler = (RecyclerView) v.findViewById(R.id.croprecycler);
        croprecycler.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        myadapter = new crop_custom_adapter(dataque_inter(), getContext());
        croprecycler.setAdapter(myadapter);


        inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                inter.setTextColor(Color.parseColor("#000000"));
                inter.setBackground(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.whiteoutline));
                below.setTextColor(Color.parseColor("#FFFFFF"));
                below.setBackground(null);
                descript.setImageResource(R.mipmap.intersss);

                RecyclerView croprecycler = (RecyclerView) v.findViewById(R.id.croprecycler);
                croprecycler.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
                myadapter = new crop_custom_adapter(dataque_inter(), getContext());
                croprecycler.setAdapter(myadapter);

            }
        });


        below.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                below.setTextColor(Color.parseColor("#000000"));
                below.setBackground(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.whiteoutline));
                inter.setTextColor(Color.parseColor("#FFFFFF"));
                inter.setBackground(null);
                descript.setImageResource(R.drawable.below);
                RecyclerView croprecycler = (RecyclerView) v.findViewById(R.id.croprecycler);
                croprecycler.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
                myadapter = new crop_custom_adapter(dataque_below(), getContext());
                croprecycler.setAdapter(myadapter);
            }
        });



        return v;
    }

    public ArrayList<cropmodel> dataque_below()
    {
        ArrayList<cropmodel> holder = new ArrayList<>();
        holder.add(new cropmodel(R.drawable.broccoli, "Broccoli", "Sun - 4-6 hrs/D", "Water - 12 mm/D", "#E8FFA7"));
        holder.add(new cropmodel(R.drawable.carrot, "Carrot", "Sun - 4-6 hrs/D", "Water - 12 mm/D", "#FFEBC2"));
        holder.add(new cropmodel(R.drawable.radish, "Radish", "Sun - 4-6 hrs/D", "Water - 12 mm/D", "#EAE8E4"));
        holder.add(new cropmodel(R.drawable.beet,"Beet", "Sun - 4-6 hrs/D", "Water - 12 mm/D", "#FFE2E2"));
        holder.add(new cropmodel(R.drawable.potato, "Potato", "Sun - 4-6 hrs/D", "Water - 12 mm/D", "#FFF4B8"));
        holder.add(new cropmodel(R.drawable.lettuce, "Lettuce", "Sun - 2-4 hrs/D", "Water - 12 mm/D", "#BFFFDA"));
        holder.add(new cropmodel(R.drawable.cabbage, "Cabbage", "Sun - 2-4 hrs/D", "Water - 12 mm/D", "#E8FFA4"));
        holder.add(new cropmodel(R.drawable.spinach, "Spinach", "Sun - 2-4 hrs/D", "Water - 12 mm/D", "#DAFF6E"));

        return holder;
    }



    public ArrayList<cropmodel> dataque_inter()
    {
        ArrayList<cropmodel> holder = new ArrayList<>();
        holder.add(new cropmodel(R.drawable.rice, "Rice", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#FFFAC9"));
        holder.add(new cropmodel(R.drawable.tomato, "Tomato", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#FFEDED"));
        holder.add(new cropmodel(R.drawable.eggplant, "Egg Plant", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#F4DFFF"));
        holder.add(new cropmodel(R.drawable.edamame, "Beans", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#F1FFC7"));
        holder.add(new cropmodel(R.drawable.melon, "Melon", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#FFE7B5"));
        holder.add(new cropmodel(R.drawable.cucumber, "Cucumber", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#BCFFD8"));
        holder.add(new cropmodel(R.drawable.squash, "Squash", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#E9FFA7"));
        holder.add(new cropmodel(R.drawable.paprika, "Peppers", "Sun - 6-8 hrs/D", "Water - 12 mm/D", "#FDE878"));

        return holder;
    }
}