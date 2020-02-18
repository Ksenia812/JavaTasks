package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the amount of rubles: ");
        int amount_of_rubles = in.nextInt();



        if (amount_of_rubles % 10 == 1)
        { System.out.println("рубль");


        }
        else if ((amount_of_rubles  % 10 == 2 || amount_of_rubles % 10 == 3 || amount_of_rubles  % 10 == 4) && amount_of_rubles  / 10 != 1)
        {
            System.out.println("рубля");

        }
        else
        {
            System.out.println("рублей");


        }

    }
}
