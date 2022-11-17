class Shape{
    void draw(){
        System.out.println("This is draw method of parent class Shape ");
    }
    void erase(){
        System.out.println("This is erase method of parent class Shape ");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("This is draw method of child class Circle ");
    }
    void erase(){
        System.out.println("This is erase method of child class Circle ");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("This is draw method of child class Triangle ");
    }
    void erase(){
        System.out.println("This is erase method of child class Triangle ");
    }
}
class Square extends Shape{
    void draw(){
        System.out.println("This is draw method of child class Square ");
    }
    void erase(){
        System.out.println("This is erase method of child class Squrae ");
    }
}
public class ShapeInfo {
    public static void main(String[] args) {
        Shape shape=new Shape();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Square square=new Square();

        System.out.println("Calling Shape(Parent) method by object of shape");
        shape.draw();
        shape.erase();

        System.out.println("\nOverriding Parent(Shape) method by object of Child(Circle)");
        circle.draw();
        circle.erase();

        System.out.println("\nOverriding Parent(Shape) method by object of Child(Triangle)");
        triangle.draw();
        triangle.erase();

        System.out.println("\nOverriding Parent(Shape) method by object of Child(Circle)");
        triangle.draw();
        triangle.erase();


    }
}
