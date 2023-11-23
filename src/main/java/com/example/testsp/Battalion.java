package com.example.testsp;

import java.util.List;

public interface Battalion {
    void addCreature(Creature creature);
    void organize();
    void accept(BattalionVisitor visitor);
}
