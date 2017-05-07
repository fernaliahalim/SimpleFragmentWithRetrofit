package com.app.fernaliahalim.simplefragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fernaliahalim on 5/7/2017.
 */

public class FragmentHome extends android.support.v4.app.Fragment {
    public FragmentHome(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment,
                        container, false);

        rootView.setMinimumWidth(container.getMinimumWidth());

        return rootView;
    }
}
