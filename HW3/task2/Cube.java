package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class Cube extends ThreeDimensionalFigure {

    public Cube(int x, int y, int side) {
        super(x,y,side,side,side);
    }

    public String getName() {
        return "Cube";
    }

    public int getArea() {
        return (int) (6 * getSide() * getSide());
    }

    public int getVolume() {
        return (int) (getSide() * getSide() * getSide());
    }

    public void setSide(int side) {
        this.setDimension1(side);
        this.setDimension2(side);
        this.setDimension3(side);
    }

    public int getSide() {
        return this.getDimension1();
    }

    public String toString() {
        return "[" + getX() + "," + getY() + "]" + " side: " + getSide();
    }
}
