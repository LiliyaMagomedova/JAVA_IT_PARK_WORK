package com.company.Task17;

public class BubbleSort {
    private People a[];

    public BubbleSort(People a[]) {
        this.a = a;
    }

    public void Sort() {
        People temp;
        for (int i = 0; i<a.length-1; i++){
            for (int j = 0; j<a.length-1-i; j++) {
                if (a[j].getAge() >a[j+1].getAge()) {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i<a.length; i++) {
            System.out.println (a[i].getName() + " "+ a[i].getAge());
        }
    }
}
