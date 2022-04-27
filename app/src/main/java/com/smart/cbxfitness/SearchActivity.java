package com.smart.cbxfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smart.cbxfitness.databinding.ActivityLoginScreenBinding;
import com.smart.cbxfitness.databinding.ActivitySearchBinding;

public class SearchActivity extends AppCompatActivity {
    ActivitySearchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.back.setOnClickListener(view -> onBackPressed());
    }
}