package com.codigo55.umovil.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.codigo55.umovil.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Acerca_de_Fragment extends Fragment {


    public Acerca_de_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_acerca_de_, container, false);
    }

}
