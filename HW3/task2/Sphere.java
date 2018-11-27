package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class Sphere extends ThreeDimensionalFigure {

    public Sphere(int x, int y, int radius) {
        super(x,y,radius,radius,radius);
    }

    public String getName() {
        return "Sphere";
    }

    public int getArea() {
        return (int) (4 * Math.PI * getRadius() * getRadius());
    }

    public int getVolume() {
        return (int) (4.0 / 3.0 * Math.PI * getRadius() * getRadius() * getRadius());
    }

    public void setRadius(int radius) {
        this.setDimension1(radius);
        this.setDimension2(radius);
        this.setDimension3(radius);
    }

    public int getRadius() {
        return this.getDimension1();
    }

    public String toString() {
       return "[" + getX() + "," + getY() + "]" + " radius: " + getRadius();
    }
}
