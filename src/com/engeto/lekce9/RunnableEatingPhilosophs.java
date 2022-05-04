package com.engeto.lekce9;

import java.util.ArrayList;

public class RunnableEatingPhilosophs  implements Runnable {
    private ArrayList<Fork> forks = new ArrayList<>();
    private ArrayList<Philosopher> philosophers = new ArrayList<>();
    private final int portionsToEate;
    private final int philosopherCount;

    public RunnableEatingPhilosophs(int philosopherCount, int portionsToEate) {
        this.portionsToEate = portionsToEate;
        this.philosopherCount = philosopherCount;
        setForks();
        setPhilosophers();
    }

    public void setForks() {
        for (int i = 0; i < philosopherCount; i++) {
            forks.add(new Fork());
        }
    }

    public void setPhilosophers() {
        for (int i = 0; i < philosopherCount; i++) {
            Philosopher philosopher = new Philosopher("filozof" + i, portionsToEate, forks.get(i), forks.get((i + 1) % philosopherCount));
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
//        Thread thread = Thread.currentThread();
//        System.out.println("thread name: " + thread.getName());
    }
}
