package com.company;

/**
 * The type Area.
 */
public class Area {
    private int length;
    private int width;

    /**
     * Instantiates a new Area.
     *
     * @param width  the width
     * @param length the length
     */
    Area(int width, int length) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets length.
     *
     * @param e the e
     */
    public void setLength(int e) {
        length = e;
    }

    /**
     * Sets width.
     *
     * @param f the f
     */
    public void setWidth(int f) {
        width = f;
    }

}
