package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class Circle extends TwoDimensionalFigure {

    public Circle(int x, int y, int radius) {
        super(x,y,radius,radius); 
    }

    public String getName() {
        return "Circle";
    }

    public int getArea() {
        return (int) (Math.PI * getRadius() * getRadius());
    }

    public void setRadius(int radius) {
        this.setDimension1(radius);
        this.setDimension2(radius);
    }

    public int getRadius() {
       return this.getDimension1();
    }

    public String toString() {
        return "[" + getX() + "," + getY() + "]" + " radius: " + getRadius();
    }
}
