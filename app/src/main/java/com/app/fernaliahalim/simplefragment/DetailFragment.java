package com.app.fernaliahalim.simplefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by fernaliahalim on 5/7/2017.
 */

public class DetailFragment extends Fragment {
    public DetailFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.detail_fragment,
                        container, false);
        rootView.setMinimumWidth(container.getMinimumWidth());

        return rootView;
    }
}
