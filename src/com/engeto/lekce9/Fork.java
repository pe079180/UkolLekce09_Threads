package com.engeto.lekce9;

public class Fork {
    private int order;
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


    public boolean takeFork() {
        boolean ok;
        if (forkStatus == ForkStatus.FREE) {
            setForkStatus(ForkStatus.TAKEN);
            ok = true;
        } else {
            ok = false;
        }
        ;
        return ok;
    }

    public void releaseFork() {
        setForkStatus(ForkStatus.TAKEN);
    }


    @Override
    public String toString() {
        return forkStatus.description;
    }
}



