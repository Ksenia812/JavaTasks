package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int k = 123654; int x =k;
        int s = 0;
        while (x != 0 ){
            s +=x%10;
            x /=10;
        }
        System.out.println("Сумма цифр в числе " + k + " = " + s);
    }


}



