package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public abstract class ThreeDimensionalFigure extends Figure {

    private int dimension1;
    private int dimension2;
    private int dimension3;

    public ThreeDimensionalFigure(int x, int y, int d1, int d2, int d3) {
        super(x,y);
        dimension1 = d1;
        dimension2 = d2;
        dimension3 = d3;
    }

    public void setDimension1(int d) {
        dimension1 = d;
    }

    public void setDimension2(int d) {
        dimension2 = d;
    }

    public void setDimension3(int d) {
        dimension3 = d;
    }

    public int getDimension1() {
        return dimension1;
    }

    public int getDimension2() {
        return dimension2;
    }

    public int getDimension3() {
        return dimension3;
    }

    public abstract int getArea();
    public abstract int getVolume();
}
