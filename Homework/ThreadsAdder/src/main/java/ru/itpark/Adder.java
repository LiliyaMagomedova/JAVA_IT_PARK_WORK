package ru.itpark;
import java.util.concurrent.locks.ReentrantLock;

public class Adder extends Thread {
    private int a[];
    private int start;
    private int end;
    ReentrantLock lock = new ReentrantLock();

    public Adder(int[] a, int start, int end) {
        this.a = a;
        this.start = start;
        this.end = end;
    }

    public  void run (){
        lock.lock();
        System.out.println("thread started");
        for (int i = start; i<=end; i++) {
            Sum.sum += a[i];
            System.out.println(Sum.sum+" "+i);
        }
        lock.unlock();
        System.out.println("thread finished");
    }
}
