package task2;

// Define a Square class with methods to create and read in info 
// for a square matrix and to compute the sum of a row, a col, either diagonal, 
// and whether it is special.

/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

import java.util.Scanner;

public class Square {

    int[][] square;

    public Square(int size) {
        square = new int[size][size];
    }

    //return the sum of the values in the given row
    public int sumRow(int row) {
        int sum = 0;
        for(int j = 0; j < square.length; j++){
            sum += square[row][j];
        }
        return sum;
    }

    //return the sum of the values in the given column
    public int sumCol(int col) {
        int sum = 0;
        for(int i = 0; i < square.length; i++){
            sum += square[i][col];
        }
        return sum;
    }

    //return the sum of the values in the main diagonal
    public int sumMainDiag() {
        //00 11 22
        int sum = 0;
        for(int s = 0; s < square.length; s++){
            sum += square[s][s];
        }
        return sum;
    }

    //return the sum of the values in the other ("reverse") diagonal
    public int sumOtherDiag() {
        //02 11 20
        int sum = 0;
        for(int s = 0; s < square.length; s++){
            sum += square[s][square.length - s - 1];
        }
        return sum;
        
    }

    //return true if the square is special (all rows, cols, and diags have
    //same sum), false otherwise
    public boolean isSpecial() {
        int[] totals = new int[square.length * 2 + 2];
        for(int a = 0 ; a < square.length ; a++){
            totals[a] = sumRow(a);   
        }
        for(int b = 0 ; b < square.length ; b++){
            totals[square.length + b] = sumCol(b);
        }
        totals[square.length * 2] = sumMainDiag();
        totals[square.length * 2 + 1] = sumOtherDiag();
        
        for(int f = 0 ; f < totals.length; f++){
            if(totals[f + 1] == totals[f]){
                if(f + 1 == totals.length - 1){
                    break;
                }
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    //read info into the square from the input stream associated with the
    //Scanner parameter
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    //print the contents of the square, neatly formatted
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + " ");
            }
            System.out.println();
        }
    }
}
