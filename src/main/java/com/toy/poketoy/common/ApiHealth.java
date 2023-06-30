package com.toy.poketoy.common;

public enum ApiHealth {
    SUCCESS("success"),
    FAIL("fail"),
    ERROR("error");

    public String getStatus() {
        return status;
    }

    public String status;
    ApiHealth(String status) {
        this.status = status;
    }
}
