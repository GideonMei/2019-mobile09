package com.example.tugas2.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugas2.R;
import com.example.tugas2.models.Club;

import java.util.List;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.MyViewHolder> {
    //1 dataset
    List<Club> listClub;

    //2 constructor
    public ClubAdapter(List<Club> listClub) {
        this.listClub = listClub;
    }

    //3 menghubungkan layout item contact ke adapter
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View clubView = layoutInflater.inflate(R.layout.item1,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(clubView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Club club = listClub.get(position);
        holder.name.setText(club.getName());
        holder.image.setImageResource(club.getImage());
    }

    @Override
    public int getItemCount() {
        return (listClub != null) ? listClub.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // membuat variabel di view holder
        public TextView name;
        public ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
        }
    }
}
