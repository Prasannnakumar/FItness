package com.smart.cbxfitness.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.smart.cbxfitness.ProfileAdapter;
import com.smart.cbxfitness.R;
import com.smart.cbxfitness.databinding.FragmentProfileBinding;

import java.util.Objects;


public class ProfileFragment extends Fragment {
    FragmentProfileBinding binding;
    private ProfileAdapter adapter;


    public ProfileFragment() {
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
        binding=FragmentProfileBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.tbltProfile.setupWithViewPager(binding.vpProfile);
      //  adapter = new ProfileAdapter(requireActivity().getSupportFragmentManager() , FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,getChildFragmentManager());
        adapter = new ProfileAdapter(getChildFragmentManager());

        adapter.addFragment(new AboutFragment() , "About");
        adapter.addFragment(new LifestyleFragment() , "Lifestyle");
        adapter.addFragment(new InsightFragment() , "Insights");

        binding.vpProfile.setAdapter(adapter);
    }
}