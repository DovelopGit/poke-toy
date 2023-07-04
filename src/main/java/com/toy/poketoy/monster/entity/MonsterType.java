package com.toy.poketoy.monster.entity;

public enum MonsterType {
    SPECIAL("특수"),
    PHYSICAL("물리");

    public String getName() {
        return name;
    }

    MonsterType(String name) {
        this.name = name;
    }

    private String name;
}
