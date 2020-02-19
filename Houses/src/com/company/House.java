package com.company;

/**
 * The type House.
 */
public class House {

    private int length;
    private int width;

    /**
     * Instantiates a new House.
     */
    public House()
    {

    }

    /**
     * Instantiates a new House.
     *
     * @param width  the width
     * @param length the length
     */
    public House(int width, int length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth ()
    {
        return width;

    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public int getLength ()
    {
        return length;

    }


    /**
     * Sets length.
     *
     * @param a the a
     */
    public void setLength (int a)
    {
      this.length = a;
    }

    /**
     * Sets width.
     *
     * @param b the b
     */
    public void setWidth(int b)
    {
   this.width = b;
    }



}
