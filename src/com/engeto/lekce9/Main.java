package com.engeto.lekce9;

public class Main {
    final static int PORTIONS_TO_EAT = 10000;
    final static int PHILOSOPHER_COUNT = 10;

    public static void main(String[] args) {

        RunnableEatingPhilosophs eatingPhilosophers = new RunnableEatingPhilosophs(PHILOSOPHER_COUNT, PORTIONS_TO_EAT);

        for (Philosopher philosopher : eatingPhilosophers.getPhilosophers()) {
            philosopher.start();
        }
    }

}
