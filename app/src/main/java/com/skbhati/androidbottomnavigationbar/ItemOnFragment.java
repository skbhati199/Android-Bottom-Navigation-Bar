package com.skbhati.androidbottomnavigationbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Skbhati on 31-01-2017.
 */

public class ItemOnFragment extends Fragment {

    public static ItemOnFragment newInstance(){
        ItemOnFragment itemOnFragment = new ItemOnFragment();
        return itemOnFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_item_one, container, false);
    }
}
