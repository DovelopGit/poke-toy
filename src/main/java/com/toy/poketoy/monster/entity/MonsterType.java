package com.toy.poketoy.monster.entity;

public enum MonsterType {
    NORMAL("노말"),
    FIRE("불꽃"),
    WATER("물"),
    GRASS("풀"),
    ELECTRICITY("전기"),
    ICE("얼음"),
    FIGHTER("격투"),
    POISON("독"),
    GROUND("땅"),
    FLY("비행"),
    ESPER("에스퍼"),
    BUG("벌레"),
    ROCK("바위"),
    GHOST("고스트"),
    DRAGON("드래곤")
    ;

    MonsterType(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
