 import java.lang.Math;
 import java.util.*;
 // Rectangle class extends abstract class Shape to call abstract method showShape 
public class Rectangle extends Shape{
    double l;
    double b;
    
    public void calculateArea(){
        //Area of the rectangle
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length:");
    l=sc.nextDouble();
    System.out.println("Enter breadth:");
    b=sc.nextDouble();
        double area=l*b;
        System.out.println("Area of Rectangle with length "+l+" and breadth "+b+" is: "+area);
    }
         public void calculatePerimeter(){
        //Perimeter of the rectangle
        double perimeter=2*l*b ;
        System.out.println("Perimeter of Rectangle with length "+l+" and breadth "+b+" is: "+perimeter);
    }
}