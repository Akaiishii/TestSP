package com.example.testsp;

import java.util.ArrayList;
import java.util.List;

public class HumanoidBattalion implements Battalion {
    private List<Creature> creatures = new ArrayList<>();

    @Override
    public void addCreature(Creature creature) {
        creatures.add(creature);
    }

    @Override
    public void organize() {
        System.out.println("Organizing Humanoid Battalion with " + creatures.size() + " creatures.");
    }

    @Override
    public void accept(BattalionVisitor visitor) {
        visitor.visit(this);
    }

}
