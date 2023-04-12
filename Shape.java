abstract class Shape{
    //contains regular and abstract method
    public void showShape(String shape){
        System.out.println("The shape is: "+shape);
    }
    //abstract methods to calculate area and perimeter
    abstract public void calculateArea();
    abstract public void calculatePerimeter();
}