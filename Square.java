import java.lang.Math;
import java.util.*;
public class Square extends Shape{
    //Square class extends abstract class Shape to call abstract method showShape 
    Scanner sc=new Scanner(System.in);
    double s;
    public void calculateArea(){
        //Area of the square
        System.out.println("Enter side of the square:");
        s=sc.nextDouble();
        double area=Math.pow(s,2);
        System.out.println("Area of Square with side "+s+" is: "+area);
    }
    public void calculatePerimeter(){
        //Perimeter of the square
        double perimeter=4*s;
        System.out.println("Perimeter of Square with side "+s+" is"+perimeter);
    }
}