package com.example.testsp;

public class BattalionLeader implements Battalion {
    @Override
    public void addCreature(Creature creature) {
        System.out.println("Adding creature to the battalion leader");
    }

    @Override
    public void organize() {
        System.out.println("Battalion leader is organizing");
    }

    @Override
    public void accept(BattalionVisitor visitor) {
        visitor.visit(this);
    }
}
