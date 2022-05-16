package com.engeto.lekce9;

public class Fork {
    private ForkStatus forkStatus = ForkStatus.FREE;

    public Fork() {
    }

    public ForkStatus getForkStatus() {
        return forkStatus;
    }

    public void setForkStatus(ForkStatus forkStatus) {
        this.forkStatus = forkStatus;
    }

    public synchronized boolean pickUpFork() {
        //synchronized, fork can't be picked by two philosophers at the same time
        boolean result = false;
        if (getForkStatus() == ForkStatus.FREE) {
            setForkStatus(ForkStatus.TAKEN);
            result = true;
        }
        return result;
    }

    @Override
    public String toString() {
        return forkStatus.description;
    }
}



