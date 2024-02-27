package com.company;

public class Worker implements Runnable{

    private double[] a;
    private double somma = 0;
    private int min;
    private int max;

    public Worker(double[] a,int min, int max){
        this.a = a;
        this.min = min;
        this.max = max;
    }


    @Override
    public void run() {
        //step 1
        /**
        for(int i = 0; i<a.length; i++){
            somma = somma + a[i];
        }
        System.out.println("La somma è: " + somma);*/
        //step 2
        /**
        for(int i = 0; i<a.length; i++){
            somma = somma + a[i];
        }*/
        
    }

    /**public double getSomma() {
        return somma;
    }*/
}
