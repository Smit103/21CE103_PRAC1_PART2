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
public class Cir2 {
   
public static void main(String[] s) {
        Cir1 c1= new Cir1();
        double area = c1.Area();
        Cir1 c2 = new Cir1(103);
        double perimeter = c2.Perimeter();
        System.out.println("The area of the Circle is " + area);
        System.out.println("The perimeter of the Circle is " + perimeter);
       
    }
}
