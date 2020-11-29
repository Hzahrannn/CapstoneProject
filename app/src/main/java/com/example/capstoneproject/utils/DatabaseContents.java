package com.example.capstoneproject.utils;

public enum DatabaseContents {
    DATABASE("loginsederhana.db"),
    TABLE_USERS("tbl_users");

    private String name;
    private DatabaseContents(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}