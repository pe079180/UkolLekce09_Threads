package com.engeto.lekce9;

public class Fork {
    private final int order;
    private ForkStatus forkStatus = ForkStatus.FREE;

    public Fork(int order) {
        this.order = order;
    }

    public ForkStatus getForkStatus() {
        return forkStatus;
    }

    public void setForkStatus(ForkStatus forkStatus) {
        this.forkStatus = forkStatus;
    }

    @Override
    public String toString() {
        return forkStatus.description;
    }
}



