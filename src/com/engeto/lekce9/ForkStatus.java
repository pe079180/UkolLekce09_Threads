package com.engeto.lekce9;

public enum ForkStatus {
    FREE("free"),
    TAKEN("taken");
    final String description;

    ForkStatus(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
