package com.example.kipchirchir.sakucity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity{

    public TextView textView;
    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    List<Song> songLists ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.play);
        recyclerView =(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        songLists =new ArrayList<>();

        for (int i = 0; i <100 ; i++) {

            Song song =new Song("Kinyuolo woiyi","Ohangla","Musa Jakadala",R.drawable.monkey_shoulder);
            songLists.add(song);
        }
        adapter =new MyAdapter(songLists,this);
        recyclerView.setAdapter(adapter);
    }
}
