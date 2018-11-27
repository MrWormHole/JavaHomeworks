package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class Rectangle extends TwoDimensionalFigure {

    public Rectangle(int x, int y, int side1, int side2) {
        super(x,y,side1,side2);
    }

    public String getName() {
        return "Rectangle";
    }

    public int getArea() {
        return this.getDimension1() * this.getDimension2();
    }

    public void setSide(int side) {
        if(side == 1){
            this.setDimension1(side);
        }
        else if(side == 2){
            this.setDimension2(side);
        }
    }

    public int getSide1() {
        return this.getDimension1();
    }

    public int getSide2() {
        return this.getDimension2();
    }

    public String toString() {
        return "[" + getX() + "," + getY() + "]" + " sides: " + getSide1() + "," + getSide2();
    }
}
