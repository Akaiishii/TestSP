package com.example.testsp;

public class OrganizeVisitor implements BattalionVisitor {
    @Override
    public void visit(Battalion battalion) {
        battalion.organize();
    }

    @Override
    public void visit(BattalionLeader battalionLeader) {
        battalionLeader.organize();
    }
}
