package com.example.anvanthinh.music.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.anvanthinh.music.R;

/**
 * Created by An Van Thinh on 3/28/2017.
 */

public class AlbumListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.album_list_fragment, container, false);
        return v;
    }
}
