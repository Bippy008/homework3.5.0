package kg.geektech.homework350;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.bumptech.glide.Glide;

import kg.geektech.homework350.databinding.FragmentPictureBinding;

public class PictureFragment extends Fragment {
    private FragmentPictureBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPictureBinding.inflate(LayoutInflater.from(requireContext()), container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //Glide.with(binding.musicImage).load("https://i.imgur.com/4ojdQP3.png").into(binding.musicImage);
    }

}
/*
<ImageView
        android:id="@+id/music_image"
                android:src="@drawable/music_picture"
                android:scaleType="centerCrop"
                style="@style/ColdFullscreen"
                android:layout_width="match_parent"
                android:layout_height="match_parent"/>

 */