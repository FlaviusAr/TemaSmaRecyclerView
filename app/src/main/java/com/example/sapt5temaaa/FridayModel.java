package com.example.sapt5temaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FridayModel extends AppCompatActivity {

    private String name;
    private String firstName;
    private int age;

    public FridayModel(String name, String firstName, int age) {
        this.name = name;
        this.firstName = firstName;
        this.age = age;
    }

    public FridayModel(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}