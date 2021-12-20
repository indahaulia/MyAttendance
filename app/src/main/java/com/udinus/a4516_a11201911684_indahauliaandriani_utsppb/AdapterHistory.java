package com.udinus.a4516_a11201911684_indahauliaandriani_utsppb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterHistory extends RecyclerView.Adapter<AdapterHistory.NamaViewHolder> {

    @NonNull
    @Override
    public NamaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.show_history, viewGroup, false);
        return new NamaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  NamaViewHolder namaViewHolder, int i) {
        String title1 = datahistory1 [i];
        namaViewHolder.txtCheckin.setText(title1);
    }

    @Override
    public int getItemCount() {
        return datahistory1.length;
    }

    public class NamaViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView txtCheckin;
        public NamaViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = (ImageView) itemView.findViewById(R.id.imgIcon);
            txtCheckin =(TextView) itemView.findViewById(R.id.txtCheckin);
        }
    }

    private String[] datahistory1;
    public AdapterHistory(String[] datahistory1){
        this.datahistory1=datahistory1;
    }

}
