/*
ID:21CE103
NAME:SMIT PATEL
 REPOSITORY LINK:https://github.com/Smit103/21CE103_PRAC1_PART2.git
AIM:Design a class named Circle containing following attributes and behavior.
•Onedouble data field named radius. The default valueis1.
•A no-argumentconstructor that creates a default circle.
•A Single argument constructor that creates a Circle with the specified radius.
•A method named getArea() that returns area of the Circle.
•A method named getPerimeter() that returns perimeterof it.
 */
public class Cir1 {

    private double r = 1;

    Cir1() {}

    Cir1(double r)
    {
        this.r = r;
    }
    public double Area()
    {
        double a;
        a=r*r*2*3.14;
        return a;
    }
    public double Perimeter()
    {
        double a;
        a=2*3.14*r;
        return a;
    }
}