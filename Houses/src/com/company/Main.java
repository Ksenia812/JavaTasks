package com.company;


/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

       House house1  =  new House(3,6);
        House house2 = new House(3, 11);
        Area area = new Area(5, 15);
        Calculations calculator = new Calculations();
        calculator.calc(house1, house2, area);

    }
}
