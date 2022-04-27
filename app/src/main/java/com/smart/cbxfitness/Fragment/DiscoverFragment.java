package com.smart.cbxfitness.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smart.cbxfitness.InsightAdapter;
import com.smart.cbxfitness.R;
import com.smart.cbxfitness.SearchActivity;
import com.smart.cbxfitness.adapter.BeginerAdapter;
import com.smart.cbxfitness.adapter.ChangeAdapter;
import com.smart.cbxfitness.adapter.WorkOutAdpter;
import com.smart.cbxfitness.databinding.FragmentDiscoverBinding;
import com.smart.cbxfitness.databinding.FragmentInsightBinding;

public class DiscoverFragment extends Fragment {
    FragmentDiscoverBinding binding;
    BeginerAdapter beginerAdapter;
    ChangeAdapter changeAdapter;
    WorkOutAdpter workOutAdpter;

    LinearLayoutManager linearLayoutManager;
    LinearLayoutManager layoutManager;
    LinearLayoutManager linearLayoutManager1;

    public DiscoverFragment() {
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
        binding = FragmentDiscoverBinding.inflate(getLayoutInflater());
        init();
        return binding.getRoot();     }

    private void init() {
        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.myRecyclerView1.setLayoutManager(linearLayoutManager);
        beginerAdapter = new BeginerAdapter(getActivity(), 5);
        binding.myRecyclerView1.setAdapter(beginerAdapter);

        layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.myRecyclerView.setLayoutManager(layoutManager);
        changeAdapter = new ChangeAdapter(getActivity(), 5);
        binding.myRecyclerView.setAdapter(changeAdapter);


        linearLayoutManager1 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        binding.myRecyclerView2.setLayoutManager(linearLayoutManager1);
        workOutAdpter = new WorkOutAdpter(getActivity(), 5);
        binding.myRecyclerView2.setAdapter(workOutAdpter);

        binding.search.setOnClickListener(view -> {
            startActivity(new Intent(getActivity(), SearchActivity.class));
        });
    }
}