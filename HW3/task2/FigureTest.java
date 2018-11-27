package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/
public class FigureTest {
    public static void main(String args[]) {
        Figure figures[] = new Figure[4];
        figures[0] = new Circle(22, 88, 4);
        figures[1] = new Rectangle(71, 96, 8, 10);
        figures[2] = new Sphere(8, 89, 2);
        figures[3] = new Cube(79, 61, 8);
        for (Figure currentFigure : figures) {
            System.out.println(currentFigure.getName() + ": " + currentFigure);
            if (currentFigure instanceof TwoDimensionalFigure) {
                TwoDimensionalFigure twoDimensionalFigure = (TwoDimensionalFigure) currentFigure;
                System.out.println(currentFigure.getName() + "'s area is " + twoDimensionalFigure.getArea());
            }
            if (currentFigure instanceof ThreeDimensionalFigure) {
                ThreeDimensionalFigure threeDimensionalFigure = (ThreeDimensionalFigure) currentFigure;
                System.out.println(currentFigure.getName() + "'s area is " + threeDimensionalFigure.getArea());
                System.out.println(currentFigure.getName() + "'s volume is " + threeDimensionalFigure.getVolume());
            }
        }
    }
}
/* You should get the following output:
------
run:
Circle: [22, 88] radius: 4
Circle's area is 50
Rectangle: [71, 96] sides: 8, 10
Rectangle's area is 80
Sphere: [8, 89] radius: 2
Sphere's area is 50
Sphere's volume is 33
Cube: [79, 61] side: 8
Cube's area is 384
Cube's volume is 512
BUILD SUCCESSFUL (total time: 0 seconds)
*/