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

        int array [] = {1, 12, 16 , 41 , 35 , 58, 8};
        int sum = getSumBetweenMinAndMax( array );
        System.out.println(sum);

    }

    /**
     * Gets sum between min and max.
     *
     * @param array the array
     * @return the sum between min and max
     */
    public static int getSumBetweenMinAndMax(int[] array)
    {
        int minIndex = 0;
        int maxIndex = 0;
        int result = 0;
        for (int i = 1 ; i < array.length ; i++)
        {
            minIndex = array [i] < array [minIndex] ? i : minIndex;
            maxIndex = array [i] > array [maxIndex] ? i : maxIndex;
        }
        for (int i = minIndex > maxIndex ? maxIndex : minIndex; i <= (minIndex < maxIndex ? maxIndex : minIndex); i++)
            result += array[i];
        return result;
    }
}