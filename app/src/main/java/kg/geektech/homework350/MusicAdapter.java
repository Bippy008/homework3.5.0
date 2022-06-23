package kg.geektech.homework350;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.homework350.databinding.MusicItemBinding;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {
    private ArrayList<Music> musics;
    private OnItemClick onItemClick;

    public MusicAdapter(ArrayList<Music> musics, OnItemClick onItemClick) {
        this.musics = musics;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MusicViewHolder(MusicItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        holder.bind(musics.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.OnItemClick(musics.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return musics.size();
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder {
        private MusicItemBinding binding;

        public MusicViewHolder(MusicItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Music music) {
            binding.singerName.setText(music.getSingerName());
            binding.songName.setText(music.getSongName());
            binding.musicNumber.setText(music.getSongNumber());
            binding.songTimestamp.setText(music.getTimestamp());
        }
    }
}
