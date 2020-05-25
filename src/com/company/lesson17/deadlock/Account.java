package com.company.lesson17.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int amount;

    private Lock lock = new ReentrantLock();

    public Lock getLock() {
        return lock;
    }

    public Account(int amount) {
        this.amount = amount;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) {
        if (this.amount < amount){
            throw new IllegalArgumentException("Not enough money");
        }
        try {
            Random random = new Random();
            Thread.sleep(100 + random.nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.amount -= amount;
    }

    public int getAmount() {
        return amount;
    }
}
