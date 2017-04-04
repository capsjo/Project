package com.example.johnny.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Johnny on 3/30/2017.
 */

public class SimpleFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.simple_fragment, container, false);
        TextView text = (TextView)v.findViewById(R.id.text_fragment);
        //Bundle args = getArguments();
        //int fragmentid = args.getInt("id");
        text.setText("SimpleFragment");
        return v;
    }
}
