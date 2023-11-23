package com.example.testsp;

import java.util.ArrayList;
import java.util.List;

public class BattalionDirector {
    private List<Battalion> battalions = new ArrayList<>();

    public void addBattalion(Battalion battalion) {
        battalions.add(battalion);
    }

    public void organizeAllBattalions() {
        System.out.println("Organizing all battalions");
        for (Battalion battalion : battalions) {
            battalion.organize();
        }
    }
}
