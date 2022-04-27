package com.smart.cbxfitness.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.smart.cbxfitness.LifestyleVerticalAdapter;
import com.smart.cbxfitness.databinding.FragmentLifestyleBinding;


public class LifestyleFragment extends Fragment {

    FragmentLifestyleBinding binding;
    LifestyleAdapter lifestyleAdapter;
    LifestyleVerticalAdapter lifestyleVerticalAdapter;
    LinearLayoutManager linearLayoutManager;
    LinearLayoutManager layoutManager;

    public LifestyleFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLifestyleBinding.inflate(getLayoutInflater());
        init();
        return binding.getRoot();
    }

    private void init() {

        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.myRecyclerView1.setLayoutManager(linearLayoutManager);
        lifestyleAdapter = new LifestyleAdapter(getActivity(), 5);
        binding.myRecyclerView1.setAdapter(lifestyleAdapter);

        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        binding.myRecyclerView.setLayoutManager(layoutManager);
        lifestyleVerticalAdapter = new LifestyleVerticalAdapter(getActivity(), 5);
        binding.myRecyclerView.setAdapter(lifestyleVerticalAdapter);
    }

}