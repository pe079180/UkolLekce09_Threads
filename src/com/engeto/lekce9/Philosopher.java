package com.engeto.lekce9;

public class Philosopher extends Thread {
    private int portionsToEat;
    private final Fork leftFork;
    private final Fork rightFork;

    public Philosopher(String name, int portionsToEat, Fork leftFork, Fork rightFork) {
        super(name);
        this.portionsToEat = portionsToEat;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    public void eatPortion() {
        if (leftFork.pickUpFork()) {
            if (rightFork.pickUpFork()) {
                // philosopher has two forks, he can eat
                portionsToEat--;
                if ((portionsToEat % 1000) == 0) {
                    System.out.println(this.getName() + " .. eating, stil have " + portionsToEat + " portions");
                }
                try {
                    sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                leftFork.setForkStatus(ForkStatus.FREE);
                rightFork.setForkStatus(ForkStatus.FREE);

            } else {
                //System.out.println("right fork blocked " + portionsToEat + " thread =" + this.getName());
                leftFork.setForkStatus(ForkStatus.FREE);
            }

        }

    }

    public void run() {
        // here is the code we want to run in thread
        while (portionsToEat > 0) {
            eatPortion();
        }

    }

}
