import java.util.*;
import java.lang.Math;
// Pyramid class extends abstract class Shape to call abstract method showShape 
public class Pyramid extends Shape implements Volume
{
    Scanner sc=new Scanner(System.in);
    double sh;
    double b;
    double h;
    public void calculateArea(){
        //Area of the Pyramid
        System.out.println("Enter slant height of the pyramid:");
        sh=sc.nextDouble();
        System.out.println("Enter base of the pyramid:");
        b=sc.nextDouble();
        double area=2*b*sh+Math.pow(b,2);
        System.out.println("Area of Pyramid is:"+area);
    }
    public void calculatePerimeter(){
        //Perimeter of the pyramid
        double perimeter=8*(Math.pow(b/2,2)+Math.pow(sh,2))+4*b;
        System.out.println("Perimeter of Square Pyramid:"+perimeter);
}
public void calculateVolume(){
        //Perimeter of the square
        System.out.println("Enter height of the pyramid:");
        h=sc.nextDouble();
        double volume=1/3*Math.pow(b,2)*h;
        System.out.println("Volume of Square pyramid is: "+volume);
}
}
