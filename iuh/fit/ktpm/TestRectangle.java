/*
 * @ (#) TestRectangle.java       1.0     27/08/2024
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
public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(25.10,64.25);

        System.out.println("Length: " + r1.getLength());
        System.out.println("Width: " + r1.getWidth());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

    }
}
