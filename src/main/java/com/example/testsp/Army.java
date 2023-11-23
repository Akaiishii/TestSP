package com.example.testsp;

import java.util.ArrayList;
import java.util.List;

public class Army implements Battalion {
    private List<Battalion> battalions = new ArrayList<>();

    @Override
    public void addCreature(Creature creature) {
        System.out.println("Adding creature to the army");
    }

    @Override
    public void organize() {
        System.out.println("Organizing the entire army");
        for (Battalion battalion : battalions) {
            battalion.organize();
        }
    }

    @Override
    public void accept(BattalionVisitor visitor) {
        for (Battalion battalion : battalions) {
            battalion.accept(visitor);
        }
        visitor.visit(this);
    }

    public void addBattalion(Battalion battalion) {
        battalions.add(battalion);
    }
}
