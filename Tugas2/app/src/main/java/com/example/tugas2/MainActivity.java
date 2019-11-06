package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugas2.adapters.ClubAdapter;
import com.example.tugas2.models.Club;

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
        Club club = new Club("MU", R.drawable.mu);
        //menambahkan club ke listClub
        listClub.add(club);
        //membuat object club baru
        club = new Club("Arema", R.drawable.arema);
        listClub.add(club);

//        com.example.tugas1.adapters.ClubAdapter clubAdapter = new com.example.tugas1.adapters.ClubAdapter(listClub);
        ClubAdapter clubAdapter = new ClubAdapter(listClub);
        rvClub.setAdapter(clubAdapter);
        rvClub.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }
}
