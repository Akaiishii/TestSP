package com.example.testsp;

public interface BattalionVisitor {
    void visit(Battalion battalion);
    void visit(BattalionLeader battalionLeader);
}
