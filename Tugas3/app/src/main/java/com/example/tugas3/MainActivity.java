package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas3.adapters.ClubAdapter;
import com.example.tugas3.models.Club;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvClub;
    List<Club> listClub = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menyambungkan rvClub ke layout
        rvClub = findViewById(R.id.rvClub);
        //Membuat object club
        Club club = new Club("Manchester United", R.drawable.mu);
        //menambahkan club ke listClub
        listClub.add(club);
        //membuat object club baru
        club = new Club("Arema FC", R.drawable.arema);
        listClub.add(club);
        club = new Club("Malang United", R.drawable.malang);
        listClub.add(club);
        club = new Club("Metro FC", R.drawable.metro);
        listClub.add(club);
        club = new Club("Persema Malang", R.drawable.persema);
        listClub.add(club);


        ClubAdapter clubAdapter = new ClubAdapter(listClub);
        rvClub.setAdapter(clubAdapter);
        rvClub.setLayoutManager(new GridLayoutManager(this, 2));
    }
}
