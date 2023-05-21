package com.example.lesson_3_4;

import java.io.Serializable;

public class Car implements Serializable {
    Integer image;
    String name;
    String title;
    String description;
    String color;
    String sum;

    public Car(Integer image, String name, String title, String description, String color, String sum) {
        this.image = image;
        this.name = name;
        this.title = title;
        this.description = description;
        this.color = color;
        this.sum = sum;
    }

    public Integer getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public String getSum() {
        return sum;
    }
}