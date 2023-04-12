import java.util.*;
import java.lang.Math;
//Sphere class extends abstract class Shape to call abstract method showShape 
public class Sphere extends Shape implements Volume
{
Scanner sc=new Scanner(System.in);
    double r;
    public void calculateArea(){
        //Area of the Sphere
        System.out.println("Enter radius of the sphere:");
        r=sc.nextDouble();
        double area=4*Math.PI*Math.pow(r,2);
        System.out.println("Area of Sphere with radius "+r+" is: "+area);
    }
    public void calculatePerimeter(){
        //Perimeter of the square
        double perimeter=2*Math.PI*r;
        System.out.println("Perimeter of Sphere with radius "+r+" is: "+perimeter);
}
public void calculateVolume(){
        //Perimeter of the square
        double volume=4/3*Math.PI*Math.pow(r,3);
        System.out.println("Volume of Sphere with radius "+r+" is: "+volume);
}
}
