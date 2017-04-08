package com.company.Task17;

public class Main {
    public static void main(String[] args) {
        People hedwig = new People ("Hedwig",9);
        People kevin = new People ("Kevin",34);
        People dennis = new People ("Dennis",43);
        People patrice = new People ("Patrice",32);
        People a[] = {hedwig, kevin, dennis, patrice};
        BubbleSort sort = new BubbleSort(a);
        sort.Sort();
    }
}