package com.example.suryasuvidha.customadapters;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.suryasuvidha.R;
import com.example.suryasuvidha.modelclass.cropmodel;

import java.util.ArrayList;

public class crop_custom_adapter extends RecyclerView.Adapter<crop_custom_adapter.myviewholder>{

    public ArrayList<cropmodel> data;
    public Context context;


    public crop_custom_adapter(ArrayList<cropmodel> data, Context context) {

        this.data = data;
        this.context = context;

    }


    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflator = LayoutInflater.from(parent.getContext());
        View v = inflator.inflate(R.layout.customview_agrivoltaics, parent, false);
        return new crop_custom_adapter.myviewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.cropparent.setBackgroundColor(Color.parseColor(data.get(position).getCardcolor()));
        holder.cropimage.setImageResource(data.get(position).getCropimage());
        holder.sunreq.setText(data.get(position).getSunreq());
        holder.waterreq.setText(data.get(position).getWaterreq());
        holder.cropname.setText(data.get(position).getCropname());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class myviewholder extends RecyclerView.ViewHolder
    {
        TextView cropname, sunreq, waterreq;
        ImageView cropimage;
        LinearLayout cropparent;


        public myviewholder(@NonNull View itemView) {
            super(itemView);
            cropname = (TextView)itemView.findViewById(R.id.name);
            waterreq=(TextView)itemView.findViewById(R.id.waterreq);
            cropimage = (ImageView)itemView.findViewById(R.id.cropimage);
            cropparent = (LinearLayout) itemView.findViewById(R.id.cropparent);
            sunreq = (TextView) itemView.findViewById(R.id.sunreq);
        }
    }


}
