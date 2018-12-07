package com.example.kipchirchir.sakucity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{

    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    List<Song> songLists ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        songLists =new ArrayList<>();


        for (int i = 0; i <100 ; i++) {

            Song song =new Song("WOga wako","Gospel","Rose huhando",R.drawable.ic_arrow_forward_black_24dp);


            songLists.add(song);
        }
        adapter =new MyAdapter(songLists,this);
        recyclerView.setAdapter(adapter);
    }
}
