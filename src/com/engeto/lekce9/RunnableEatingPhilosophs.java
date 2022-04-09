package com.engeto.lekce9;

import java.util.ArrayList;

public class RunnableEatingPhilosophs implements Runnable{
    private ArrayList<Fork> forks;
    private ArrayList<Philosopher> philosophers;
    private int portionsToEate;
    private int philosopherCount;

    public RunnableEatingPhilosophs(int philosopherCount,int portionsToEate) {
        this.portionsToEate = portionsToEate;
        this.philosopherCount = philosopherCount;
        setForks();
        setPhilosophers();
    }

    public void setForks () {
        this.forks = new ArrayList<>();
        for (int i = 0; i < philosopherCount; i++) {
            this.forks.add(new Fork(i));
        }
    }

    public void setPhilosophers() {
        int secondForkIndex;
        this.philosophers = new ArrayList<>();
        for (int i = 0; i < philosopherCount; i++) {
            if (i == philosopherCount - 1) {
                secondForkIndex = 0;
            } else {
                secondForkIndex = i + 1;
            }
            ;
            Philosopher philosopher = new Philosopher("filozof" + i, portionsToEate, forks.get(i), forks.get(secondForkIndex));
            philosophers.add(philosopher);
        }
    }

    public ArrayList<Fork> getForks() {
        return forks;
    }

    public ArrayList<Philosopher> getPhilosophers() {
        return philosophers;
    }

    public int getPortionsToEate() {
        return portionsToEate;
    }

    public int getPhilosopherCount() {
        return philosopherCount;
    }

    @Override
    public void run() {
                //Thread thread = Thread.currentThread();
                // System.out.println("thread name: " + thread.getName());

    }
}
