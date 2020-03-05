package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 17;
        long bigcount = 999999999900000000L;
        float fcount = 1.6f;
        double dcount = 1.0/3.0;
        char symbol= 'z';
        System.out.println(count);
        System.out.println(bigcount);
        System.out.println(fcount);
        System.out.println(dcount);
        System.out.println(symbol);

        String name = "Hello world!!!!";

        System.out.println(name);
        int a = 5;
        int b = 3;

        System.out.println(a);
        boolean res = a <= b;
        System.out.println(res);

        int[] array = new int[5];
        array[0] = 2;
        array[1] = 1;
        array[2] = 0;
        array[3] = 5;
        array[4] = 3;

        for (int i = array.length; i > 0; i--){
            System.out.println("Забил в "+ (i) + "-м матче -> "+array[i-1]);
        }

        int i = 0;
        while (i < array.length){
            System.out.println( array[i]);
            i++;
        }

        for ( i = 0; i < array.length; i++){
            System.out.print("В "+ (i+1)+"-м матче ");
            switch (array[i]){
                case 0:
                    System.out.println("не забил ни одного гола");
                    break;
                case 1:
                    System.out.println("забил гол");
                    break;
                case 2:
                    System.out.println("оформил дубль");
                    break;
                case 3:
                    System.out.println("оформил хет трик");
                    break;
                default:
                    System.out.println("играл как боженька");

            }
        }

        // write your code here
    }
}
