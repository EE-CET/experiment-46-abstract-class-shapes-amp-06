abstract class Shape {
    void numberOfSide(){}
   
}

class Rectangle extends Shape
{
    void numberOfSide()
    {
        System.out.println("Rectangle has 4 sides");
    }
}

class Triangle extends Shape
{
    void numberOfSide()
    {
        System.out.println("Triangle has 3 sides");
    }
}

class Hexagon extends Shape
{
    void numberOfSide()
    {
        System.out.println("Hexagon has 6 sides");
    }
}

public class AbstractShapes {
    public static void main(String args[]){
        Shape obj1 = new Rectangle();
        Shape obj2= new Triangle();
        Shape obj3 = new Hexagon();
        obj1.numberOfSide();
        obj2.numberOfSide();
        obj3.numberOfSide();
    
}}
