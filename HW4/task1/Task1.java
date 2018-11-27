package task1;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

abstract class GeometricObject {
    private String color = "white";

    protected GeometricObject(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }

    public abstract double getPerimeter();
}

public class Task1 {

    public static void main(String[] args) {
        try {
            Triangle t1 = new Triangle(1.5, 2, 3);
            System.out.println(t1.toString());
            System.out.println("Perimeter for t1: " + t1.getPerimeter());
            t1.howToColor();

            Triangle t2 = new Triangle(1, 2, 3);
            System.out.println(t2.toString());
            System.out.println("Perimeter for t2: " + t2.getPerimeter());
            t2.howToColor();
        } catch (TriangleException ex) {
            // getMessage() is a method of the Exception class returning the detail message string
            System.out.println(ex.getMessage());
            System.out.println("Side1: " + ex.getSide1());
            System.out.println("Side2: " + ex.getSide2());
            System.out.println("Side3: " + ex.getSide3());
        }
    }
}

interface Colorable {
    public abstract void howToColor();
}

class TriangleException extends Exception {
    
    double side1,side2,side3;
    String message;
    
    public TriangleException(double side1,double side2,double side3, String s) { // COMPLETE.....
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        message = s;
    }

    public double getSide1(){
        return side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    public String getMessage(){
        return message;
    }
}

class Triangle extends GeometricObject implements Colorable { // COMPLETE.....

    double side1,side2,side3;

    public Triangle(double side1, double side2, double side3) throws TriangleException {
        super("red");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if(side1 + side2 > side3 && Math.abs(side1 - side2) < side3){
            
        }
        else{
            throw new TriangleException(side1,side2,side3,"Triangle inequality violation!");
        }
    }

    @Override
    public void howToColor(){
        System.out.println("Color all three sides");
    }
    
    @Override
    public String toString(){
        return super.toString() + " Sides: " + side1 + ", " + side2 + ", " + side3; /////
    }
    
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}
/* You should get the following output:
------
run:
Color: red Sides: 1.5, 2.0, 3.0
Perimeter for t1: 6.5
Color all three sides.
Triangle inequality violation!
Side1: 1.0
Side2: 2.0
Side3: 3.0
BUILD SUCCESSFUL (total time: 1 second)
 */
