package com.company;

/**
 * The type Calculations.
 */
public class Calculations {
    /**
     * Calc.
     *
     * @param house1 the house 1
     * @param house2 the house 2
     * @param area   the area
     */
    void calc(House house1, House house2, Area area) {
    int a = house1.getLength();
    int b = house1.getWidth();
    int c = house2.getLength();
    int d = house2.getWidth();
    int e = area.getLength();
    int f = area.getWidth();
    if (((a + c) <= e) && (b <= f && d <= f)) {
        System.out.println("Дома можно построить");
    } else if (((b + d) <= f) && (a <= e && c <= e)) {
        System.out.println("Дома можно построить");
    } else if (((b + c) <= e) && (a <= f && d <= f)) {
        System.out.println("Дома можно построить");
    } else if (((a + d) <= e) && (b <= f && c <= f)) {
        System.out.println("Дома можно построить");
    } else if (((a + d) <= f) && (b <= e && c <= e)) {
        System.out.println("Дома можно построить");
    } else if (((b + c) <= f) && (a <= e && 2 <= e)) {
        System.out.println("Дома можно построить");
    } else if (((a + c) <= f) && (b <= e && d <= e)) {
        System.out.println("Дома можно построить");
    } else if (((b + d) <= e) && (a <= f && c <= f)) {
        System.out.println("Дома можно построить");
    } else {
        System.out.println("Дома нельзя построить");
    }
}


}
