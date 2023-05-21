package com.example.lesson_3_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.lesson_3_4.adapter.CarAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Car> arrayListCars = new ArrayList<>();
    private RecyclerView recyclerView;
    private CarAdapter adapter = new CarAdapter(arrayListCars, this::onClick);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        initData();
    }

    private void initData() {
        arrayListCars.add(new Car(R.drawable.img_2, "MERCEDES - BENZ", "E230",
                "I AM SELLING DIRECTLY. Engine displacement: 2.3. Year of release: 1995. Fuel consumption 8-11l. Condition: Used. Drive: rear. Automatic mechanics .........",
                "White", "2400 $"));
        arrayListCars.add(new Car(R.drawable.img_1, "LEXUS", "LX470",
                "I SELL NOW. Japanese. Engine size: 4.7.Year of release: 2005. Fuel consumption 14-18l. Condition: Used. Drive: 4 WD. Automatic transmission.........",
                "Black", "20 990 $"));
        arrayListCars.add(new Car(R.drawable.img_3, "TOYOTA", "LAND CRUISER 200",
                "I AM SELLING DIRECTLY. Engine displacement: 5.7. Year of release: 2008. Fuel consumption 15-19l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Silver", "22 750 $"));
        arrayListCars.add(new Car(R.drawable.img_4, "HONDA", "ODYSSEY",
                "I AM SELLING DIRECTLY. Engine displacement: 2.4. Year of release: 2003. Fuel consumption 7-8l. Condition: Used. Drive: front. Automatic transmission.........",
                "White pearls", "6800 $"));
        arrayListCars.add(new Car(R.drawable.img, "NISSAN", "PATROL",
                "I SELL NOW. Engine displacement : 4.0 . Year of manufacture: 2022. Fuel consumption 13-15l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Golden", "65 000 $"));
        arrayListCars.add(new Car(R.drawable.img, "NISSAN", "PATROL",
                "I SELL NOW. Engine displacement : 4.0 . Year of manufacture: 2022. Fuel consumption 13-15l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Golden", "65 000 $"));
        arrayListCars.add(new Car(R.drawable.img, "NISSAN", "PATROL",
                "I SELL NOW. Engine displacement : 4.0 . Year of manufacture: 2022. Fuel consumption 13-15l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Golden", "65 000 $"));
        arrayListCars.add(new Car(R.drawable.img, "NISSAN", "PATROL",
                "I SELL NOW. Engine displacement : 4.0 . Year of manufacture: 2022. Fuel consumption 13-15l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Golden", "65 000 $"));
        arrayListCars.add(new Car(R.drawable.img, "NISSAN", "PATROL",
                "I SELL NOW. Engine displacement : 4.0 . Year of manufacture: 2022. Fuel consumption 13-15l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Golden", "65 000 $"));
        arrayListCars.add(new Car(R.drawable.img, "NISSAN", "PATROL",
                "I SELL NOW. Engine displacement : 4.0 . Year of manufacture: 2022. Fuel consumption 13-15l. Condition: Used. Drive: 4WD. Automatic transmission.........",
                "Golden", "65 000 $"));

        adapter = new CarAdapter(arrayListCars, this::onClick);
        recyclerView.setAdapter(adapter);
    }

    private void onClick(Car car) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("image", car.getImage());
        intent.putExtra("title", car.getTitle());
        intent.putExtra("description", car.getDescription());
        intent.putExtra("color", car.getColor());
        intent.putExtra("sum", car.getSum());
        startActivity(intent);
    }
}