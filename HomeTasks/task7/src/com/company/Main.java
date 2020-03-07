package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the parameters: ");
        double a = in.nextInt();

        double b = in.nextInt();

        double c = in.nextInt();

        double d = in.nextInt();

        double e = in.nextInt();

        double f = in.nextInt();


        if ((a+c)<=e && (b+d)<=f )
        {
            System.out.println("It is possible to build two houses");
        }
        if ((a+c)<=f && (b+d)<=e )
        {
            System.out.println("It is possible to build two houses");
        }
       if ((a+d)<=e && (b+c)<=f )
       {
           System.out.println(("It is possible to build two houses"));
       }
       if ((a+d)<=f && (b+c)<=e )
       {
           System.out.println(("It is possible to build two houses"));
       }
        else
            {
                System.out.println("It is not possible to build two houses");
            }


    }
}