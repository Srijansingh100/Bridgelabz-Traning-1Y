package com.gla.methods;

public class circle {
    public void areaofcir(int radius){
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);

    }

    public void circum(int radius){
        double circum = Math.PI *2 * radius ;
        System.out.println("The circumference of the circle is: " + circum);
    }

}
