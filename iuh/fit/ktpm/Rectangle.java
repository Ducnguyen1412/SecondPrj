/*
 * @ (#) Rectangle.java       1.0     27/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.ktpm;

/*
 * @description: This class represents a bank with many bank accounts
 * author: Nguyen Van Duc
 * @date: 27/08/2024
 * @version     1.0
 */
public class Rectangle {
    /**
     * Defaut constructor
     */
    private double length;
    private double width;

    public Rectangle() {
        this(0.0, 0.0);
    }

    /**
     * Constructor with patameters
     * @param l The length of the rectangle
     * @param w The width of the rectangle
     * @throws IllegalArgumentException if length less than 0 or width less than 0
     */
    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        if(length < 0){
            throw new IllegalArgumentException("Length must be greater than 0");}
        this.length = length;
        }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if(width < 0){
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    /**
     *
     * @return Perimetre = 2 * (length + width)
     */

    public double getPerimeter() {
        return 2 * (length + width);
    }

    /**
     *
     * @return Area = length * width
     */

    public double getArea() {
        return length * width;
    }
}