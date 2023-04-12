/**Dhvani Uday Parekh
 * AIML-B3
 * 21070126126
 */
import java.util.*;
public class Main{
    public static void main(String[] args){ 
        /**creating resective objects of different classes
         * calling the abstract method from Shape Abstract Class
         * calling abstract methods and interface to display respective Area, Perimeter and 
         * Volume for sphere, pyramid and cylinder.
         */
        Circle circle=new Circle();
        circle.showShape("Circle");
        circle.calculateArea();
        circle.calculatePerimeter();
        
       Rectangle rectangle=new Rectangle();
       rectangle.showShape("Rectangle");
       rectangle.calculateArea();
       rectangle.calculatePerimeter();
       
       
       Square square=new Square();
       square.showShape("Square");
       square.calculateArea();
       square.calculatePerimeter();
       
       Sphere sphere=new Sphere();
       sphere.showShape("Sphere");
       sphere.calculateArea();
       sphere.calculatePerimeter();
       sphere.calculateVolume();
       
        Pyramid pyramid=new Pyramid();
        pyramid.showShape("Pyramid");
        pyramid.calculateArea();
        pyramid.calculatePerimeter();
        pyramid.calculateVolume();
             
        Cylinder cylinder=new Cylinder();
        cylinder.showShape("Cylinder");
        cylinder.calculateArea();   
        cylinder.calculatePerimeter();
        cylinder.calculateVolume();
    }
}