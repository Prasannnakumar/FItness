package com.smart.cbxfitness.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smart.cbxfitness.InsightAdapter;
import com.smart.cbxfitness.LifestyleVerticalAdapter;
import com.smart.cbxfitness.R;
import com.smart.cbxfitness.databinding.FragmentInsightBinding;
import com.smart.cbxfitness.databinding.FragmentLifestyleBinding;


public class InsightFragment extends Fragment {

    FragmentInsightBinding binding;
    InsightAdapter insightAdapter;

    LinearLayoutManager linearLayoutManager;
    public InsightFragment() {
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
        binding = FragmentInsightBinding.inflate(getLayoutInflater());
        init();
        return binding.getRoot();    }
    private void init() {

        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        binding.myRecyclerView1.setLayoutManager(linearLayoutManager);
        insightAdapter = new InsightAdapter(getActivity(), 5);
        binding.myRecyclerView1.setAdapter(insightAdapter);


    }
}