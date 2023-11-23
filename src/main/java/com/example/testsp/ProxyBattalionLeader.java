package com.example.testsp;

public class ProxyBattalionLeader implements Battalion {
    private BattalionLeader battalionLeader;

    @Override
    public void addCreature(Creature creature) {
        if (battalionLeader == null) {
            battalionLeader = new BattalionLeader();
        }
        battalionLeader.addCreature(creature);
    }

    @Override
    public void organize() {
        if (battalionLeader == null) {
            battalionLeader = new BattalionLeader();
        }
        battalionLeader.organize();
    }

    @Override
    public void accept(BattalionVisitor visitor) {
        if (battalionLeader == null) {
            battalionLeader = new BattalionLeader();
        }
        visitor.visit(battalionLeader);
    }
}
