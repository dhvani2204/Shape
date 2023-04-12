import java.util.*;
import java.lang.Math;
// Cylinder class extends abstract class Shape to call abstract method showShape 
public class Cylinder extends Shape implements Volume
{
    Scanner sc=new Scanner(System.in);
    double r;
    double h;
    public void calculateArea(){
        //Total Surface Area of the Cylinder
        System.out.println("Enter radius of the cylinder:");
        r=sc.nextDouble();
        System.out.println("Enter height of the cylinder:");
        h=sc.nextDouble();
        
        double area=(2*Math.PI*r*h)+(2*Math.PI*Math.pow(r,2));
        System.out.println("Area of cylinder is: "+area);
    }
    public void calculatePerimeter(){
        //Perimeter of the cylinder
        double perimeter=2*(2*r+h);
        System.out.println("Perimeter of Cylinder is: "+perimeter);
}
public void calculateVolume(){
        //Volume of the cylinder
        double volume=Math.PI*Math.pow(r,2)*h;
        System.out.println("Volume of Cylinder is: "+volume);
}
}
