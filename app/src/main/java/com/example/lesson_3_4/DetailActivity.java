package com.example.lesson_3_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lesson_3_4.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {


    private ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getData();

    }

    private void getData() {
        Integer icon = getIntent().getIntExtra("image", 0);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String color = getIntent().getStringExtra("color");
        String sum = getIntent().getStringExtra("sum");
        binding.imageViewDetail.setImageResource(icon);
        binding.textViewDTitle.setText(title);
        binding.textViewDescription.setText(description);
        binding.textViewDColor.setText(color);
        binding.textViewDSum.setText(sum);

    }
}