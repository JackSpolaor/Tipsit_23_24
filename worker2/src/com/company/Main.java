package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //step 1
       /** double[] array = new double[100];


        for(int i = 0; i<array.length; i++){
            Random r = new Random();
            array[i] =  r.nextDouble();
        }

        Worker worker = new Worker(array);
        Thread t1 = new Thread(worker);
        t1.start();*/

       //step 2
        double[] array = new double[1000];
        double somma = 0;

        for(int i = 0; i<array.length; i++){
            Random r = new Random();
            array[i] =  r.nextDouble();
            somma = somma + array[i];
        }

        Worker worker = new Worker(array, 20,300);
        Thread t1 = new Thread(worker);
        Worker worker2 = new Worker(array, 110,453);
        Thread t2 = new Thread(worker);
        Worker worker3 = new Worker(array, 189,638);
        Thread t3 = new Thread(worker);
        Worker worker4 = new Worker(array, 263,801);
        Thread t4 = new Thread(worker);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        double somtot = worker.getSomma() + worker2.getSomma() + worker3.getSomma() + worker4.getSomma();
        System.out.println(somma);
        System.out.println(somtot);



    }
}
