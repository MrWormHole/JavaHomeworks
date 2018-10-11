package task2;

// Uses the Square class to read in square data and tell if each square is special.

/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SquareTest {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("inputSquare.txt"));
        int count = 1;              //count which square we're on 
        int size = scan.nextInt();  //size of next square

        // Expecting -1 at bottom of input file 
        while (size != -1) {

            // create a new Square of the given size
            Square squareObj = new Square(size);
            
            // call its read method to read the values of the square
            squareObj.readSquare(scan);
            
            System.out.println("\n******** Square " + count + " ********");

            // print the square
            squareObj.printSquare();
            
            // print the sums of its rows
            for(int m = 0; m < size; m++){
                System.out.println("Sum of row " + m + ": " + squareObj.sumRow(m));
            }
            
            // print the sums of its columns
            for(int m = 0; m < size; m++){
                System.out.println("Sum of col " + m + ": " + squareObj.sumCol(m));
            }
            
            // print the sum of the main diagonal
            System.out.println("Sum of main diagonal: " + squareObj.sumMainDiag());
            
            // print the sum of the other diagonal
            System.out.println("Sum of other diagonal: " + squareObj.sumOtherDiag());
            
            // determine and print whether it is a special square
            if(squareObj.isSpecial()){
                System.out.println("It's a special square");
            }
            else{
                System.out.println("It's not a god damn special square");
            }
            
            size = scan.nextInt();
            count++;
        }

    }
}
