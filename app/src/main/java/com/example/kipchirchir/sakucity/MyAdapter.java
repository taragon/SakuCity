package com.example.kipchirchir.sakucity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    public List<Song> songList;
    public Context context;

    public MyAdapter(List<Song> songList, Context context) {
        this.songList = songList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.songdisplay,viewGroup,false);
        ViewHolder holder =new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        Song song =songList.get(position);
        viewHolder.title.setText(song.getTitle());
        viewHolder.songbywho.setText(song.getByWho());
        viewHolder.genre.setText(song.getGenre());
        viewHolder.image.setImageResource(song.getImageId());
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, songbywho,genre;
        Button play;
        Spinner options;
        ImageView image;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            songbywho =(TextView)itemView.findViewById(R.id.song_bywho);
            title=(TextView)itemView.findViewById(R.id.song_title);
            genre =(TextView)itemView.findViewById(R.id.song_genre);
            image =(ImageView)itemView.findViewById(R.id.song_image);
        }
    }
}
