package ru.itpark;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,k;
        int start,end;
        System.out.println("Введите n, k");
        n = scanner.nextInt();
        k = scanner.nextInt();
        int a[] = new int[n];
        Random random = new Random();

        for (int i = 0; i<n; i++) {
           // a[i] = i;
            a[i] = random.nextInt(10);
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        Adder s[] = new Adder[k];
        for (int i = 0; i<k; i++) {

            if (i == k - 1) {
                start = (k-1)* (n / k);
                end = n - 1;
            } else {
                start = i * (n / k);
                end = start + n / k - 1 ;
            }

            s[i] = new Adder(a,start,end);
            try {
                s[i].start();
                s[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("сумма = "+Sum.sum);
    }

}
