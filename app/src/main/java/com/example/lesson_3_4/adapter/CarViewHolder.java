package com.example.lesson_3_4.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lesson_3_4.Car;
import com.example.lesson_3_4.R;

public class CarViewHolder extends RecyclerView.ViewHolder {


    ImageView profile;
    TextView name, title, description, color, summa;

    public CarViewHolder(@NonNull View itemView) {
        super(itemView);
    }


    @SuppressLint("SetTextI18n")
    public void onBind(Car car) {
        profile = itemView.findViewById(R.id.imageViewCar);
        name = itemView.findViewById(R.id.textViewName);
        title = itemView.findViewById(R.id.textViewTitle);
        description = itemView.findViewById(R.id.textViewItemDescription);
        color = itemView.findViewById(R.id.textViewColor);
        summa = itemView.findViewById(R.id.textViewSum);

        profile.setImageResource(car.getImage());
        name.setText(car.getName());
        title.setText(car.getTitle());
        description.setText(car.getDescription());
        color.setText(car.getColor());
        summa.setText(car.getSum());
    }

}
