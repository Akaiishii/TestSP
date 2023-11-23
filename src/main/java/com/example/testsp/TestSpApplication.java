package com.example.testsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class TestSpApplication {
    public static void main(String[] args) {
        Battalion humanoidBattalion = new HumanoidBattalion();
        humanoidBattalion.addCreature(new Gnome());
        humanoidBattalion.addCreature(new Elf());

        Battalion mysticBattalion = new MysticBattalion();
        mysticBattalion.addCreature(new Ent());

        Army army = new Army();
        army.addBattalion(humanoidBattalion);
        army.addBattalion(mysticBattalion);

        army.organize();

        ProxyBattalionLeader proxyLeader = new ProxyBattalionLeader();
        proxyLeader.addCreature(new Gnome());
        proxyLeader.organize();

        OrganizeVisitor organizeVisitor = new OrganizeVisitor();
        humanoidBattalion.accept(organizeVisitor);

        BattalionDirector battalionDirector = new BattalionDirector();
        battalionDirector.addBattalion(humanoidBattalion);
        battalionDirector.addBattalion(mysticBattalion);
        battalionDirector.organizeAllBattalions();
    }
}
