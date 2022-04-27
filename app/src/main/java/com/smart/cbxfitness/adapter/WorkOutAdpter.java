package com.smart.cbxfitness.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.smart.cbxfitness.InsightAdapter;
import com.smart.cbxfitness.R;

public class WorkOutAdpter extends RecyclerView.Adapter<WorkOutAdpter.Holder>{
    int Data = 10;
    private Context context;

    public WorkOutAdpter(Context context, int data) {
        this.context = context;
        this.Data = data;
    }


    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cell_workout, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return Data;
    }


    public class Holder extends RecyclerView.ViewHolder {
        ImageView imgBanner;

        public Holder(@NonNull View itemView) {
            super(itemView);

        }
    }
}
