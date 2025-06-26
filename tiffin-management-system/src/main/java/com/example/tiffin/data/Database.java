package com.example.tiffin.data;

import com.example.tiffin.model.Bachelor;
import com.example.tiffin.model.Housewife;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Housewife> housewives = new ArrayList<>();
    public static List<Bachelor> bachelors = new ArrayList<>();

    public static void addHousewife(Housewife h) {
        housewives.add(h);
    }

    public static void addBachelor(Bachelor b) {
        bachelors.add(b);
    }

    public static List<Housewife> getHousewives() {
        return housewives;
    }

    public static List<Bachelor> getBachelors() {
        return bachelors;
    }
}
