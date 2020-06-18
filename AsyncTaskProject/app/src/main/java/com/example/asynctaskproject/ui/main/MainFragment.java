package com.example.asynctaskproject.ui.main;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.asynctaskproject.ImageDownloader;
import com.example.asynctaskproject.R;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance()
    {
        return new MainFragment();
    }

    String url = "https://github.com/karleshwer/CS3876392020/blob/master/Bangalore%20by%20night.jpg?raw=true";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.main_fragment, container, false);
        ImageView remote_image = (ImageView) root.findViewById(R.id.remote_image);
        ImageDownloader loadTask = new ImageDownloader(this.getActivity());
        loadTask.execute(url);

        return root;
    }



}