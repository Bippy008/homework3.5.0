package kg.geektech.homework350;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kg.geektech.homework350.databinding.FragmentMusicBinding;

public class MusicFragment extends Fragment implements OnItemClick{
    private FragmentMusicBinding binding;
    private ArrayList<Music> musics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMusicBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        MusicAdapter adapter = new MusicAdapter(musics, this);
        binding.musicRecycler.setAdapter(adapter);
    }

    private void loadData() {
        musics = new ArrayList<>();
        musics.add(new Music("1", "Blank Space", "Taylor Swift", "3:22"));
        musics.add(new Music("2", "Watch Me", "Silento", "5:36"));
        musics.add(new Music("3", "Earned It", "The Weekend", "4:51"));
        musics.add(new Music("4", "The Hills", "The Weekend", "3:41"));
        musics.add(new Music("5", "ghostin", "Ariana Grande", "4:31"));
        musics.add(new Music("6", "Levitating", "Dua Lipa", "3:24"));
        musics.add(new Music("7", "imagine", "Ariana Grande", "3:32"));
        musics.add(new Music("8", "NASA", "Ariana Grande", "3:02"));
    }

    @Override
    public void OnItemClick(Music music) {
        Intent intent = new Intent(requireContext(), SecondActivity.class);
        startActivity(intent);
    }
}