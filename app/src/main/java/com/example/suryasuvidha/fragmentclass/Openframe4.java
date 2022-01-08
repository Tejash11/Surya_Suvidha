package com.example.suryasuvidha.fragmentclass;


import android.content.Intent;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.suryasuvidha.R;
import com.example.suryasuvidha.activityclass.MainActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Openframe4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Openframe4 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Openframe4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Openframe4.
     */
    // TODO: Rename and change types and number of parameters
    public static Openframe4 newInstance(String param1, String param2) {
        Openframe4 fragment = new Openframe4();
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
        View v =  inflater.inflate(R.layout.fragment_openframe4, container, false);

        Bundle bundle = getArguments();


        TextView guest = (TextView) v.findViewById(R.id.guest);
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getContext(), MainActivity.class);
                i.putExtra("bundle", bundle);
                startActivity(i);
            }
        });


        View mark1 = (View) v.findViewById(R.id.markframe1);
        View mark2 = (View) v.findViewById(R.id.markframe2);
        View mark3 = (View) v.findViewById(R.id.markframe3);
        View mark4 = (View) v.findViewById(R.id.markframe4);
        View mark5 = (View) v.findViewById(R.id.markframe5);


        mark1.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orangecircle));
        mark2.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orangecircle));
        mark3.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orangecircle));
        mark4.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orangecircle));
        mark5.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.orangecircle));

        return v;

    }
}