package task1;

/* 
    Complete the following code to produce a chart similar to the one below that 
    indicates how many students scored in the range 91 to 100, 81 to 90 and so on. 
    Print one number sign (#) for each student in that range.
        91 - 100 | ##
        81 - 90  | ####
        71 - 80  |
        61 - 70  | #######
        51 - 60  | #### 
        41 - 50  | ## 
        31 - 40  | #
        21 - 30  | ##
        11 - 20  |
        0  - 10  | #
*/

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

public class Histogram {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("inputGrade.txt"));
        int[] ranges = new int[10];  
        int entered;
        
        while (scan.hasNextInt()) {
            entered = scan.nextInt();
            manageRangesAccordingToInputGrade(entered,ranges); //Freshly added at 11.10.2018
        }
        
        printResults(ranges); //Freshly added at 11.10.2018
    }
    
    static void manageRangesAccordingToInputGrade(int currentNumber,int[] rangeArr ){
        //dummy checking
        if( currentNumber <= 10){
            rangeArr[0]++;
        }
        else if(currentNumber <= 20){
            rangeArr[1]++;
        }
        else if(currentNumber <= 30){
            rangeArr[2]++;
        }
        else if(currentNumber <= 40){
            rangeArr[3]++;
        }
        else if(currentNumber <= 50){
            rangeArr[4]++;
        }
        else if(currentNumber <= 60){
            rangeArr[5]++;
        }
        else if(currentNumber <= 70){
            rangeArr[6]++;
        }
        else if(currentNumber <= 80){
            rangeArr[7]++;
        }
        else if(currentNumber <= 90){
            rangeArr[8]++;
        }
        else if(currentNumber <= 100){
            rangeArr[9]++;
        }
        else{
            System.out.println("----------------------------------------------------");
            System.out.print("INVALID GRADE PLEASE SUBMIT A NUMBER BETWEEN 0 AND 100");
            System.out.println("----------------------------------------------------");
        }
    }
    
    static void printResults(int[] rangeArr){
        //genius string editing
        for(int i = 9; i >= 0 ; i--){
            int first = i*10 + 1;
            int second = i*10 +10;
            String hashCount = new String(new char[rangeArr[i]]).replace("\0","#");
            System.out.printf("%d - %d | %s \n", first , second , hashCount);
        }
    }
}
