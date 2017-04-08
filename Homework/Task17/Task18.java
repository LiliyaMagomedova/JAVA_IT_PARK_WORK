package com.company.Task17;

public class Task18 {
    public static void main(String[] args) {
        People hedwig = new People ("Hedwig",9);
        People kevin = new People ("Kevin",34);
        People dennis = new People ("Dennis",43);
        People patrice = new People ("Patrice",32);
        People a[] = {hedwig, kevin, dennis, patrice};
        int amount[] = new int[100];
        int k = 0;
        for (int i = 0; i<a.length; i++) {
            amount[a[i].getAge()]+=1;
        }

        for (int i = 0; i<100; i++) {
            System.out.println(amount[i]+" people of "+i + " age");
        }
    }
}