import java.lang.Math;
import java.util.*;
// Circle class extends abstract class Shape to call abstract method showShape 
public class Circle extends Shape{
  double r;
  
    public void calculateArea(){
        //Area of the circle
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter radius of the circle:");
    r=sc.nextDouble();
     double area=Math.PI*Math.pow(r,2);
     System.out.println("Area of Circle with radius "+r+" is: "+area);
    }
    public void calculatePerimeter(){
        //Perimeter of the circle
        double perimeter=2*Math.PI*r;
        System.out.println("Perimeter of Circle with radius "+r+" is: "+perimeter);
    }
}