package task2;
/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/
import java.util.InputMismatchException;
import java.util.Scanner;

class MyInputException extends Exception {
    @Override
    public String toString(){
        return "task2.MyInputException: Positive numbers!";
    }
}

public class Task2 {

    public static int quotient(int numerator, int denominator) throws ArithmeticException,MyInputException {
        if(numerator < 0 || denominator < 0){
            throw new MyInputException();
        }
        if(denominator == 0){
            throw new ArithmeticException();
        }
        System.out.println(numerator + " / " + denominator + " = " + numerator / denominator );
        return numerator / denominator;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;
        int exCheck = 0;

        do {
            try {
                System.out.print("\nEnter an integer numerator: ");
                int numerator = scanner.nextInt();
                System.out.print("Enter an integer denominator: ");
                int denominator = scanner.nextInt();
                int res = quotient(numerator,denominator);
                exCheck = 3;
            } catch (MyInputException ex) {
                System.out.println(ex);
                exCheck--;
            } catch (InputMismatchException ex) {
                System.out.println(ex);
                scanner.nextLine();
                System.out.println("Enter integers!");
                exCheck--;
            } catch (ArithmeticException ex) {
                System.out.println(ex + " / by zero");
                System.out.println("Invalid denominator!");
                exCheck--;
            }
            if(exCheck == 3){
                continueLoop = false;
            }
            
        } while (continueLoop);
    }
}
/* You should get the following output:
------
run:

Enter an integer numerator: -100
Enter an integer denominator: 5
task2.MyInputException: Positive numbers!

Enter an integer numerator: 100
Enter an integer denominator: -5
task2.MyInputException: Positive numbers!

Enter an integer numerator: 100
Enter an integer denominator: hello
java.util.InputMismatchException
Enter integers!

Enter an integer numerator: 100
Enter an integer denominator: 0
java.lang.ArithmeticException: / by zero
Invalid denominator!

Enter an integer numerator: 100
Enter an integer denominator: 5
100 / 5 = 20
BUILD SUCCESSFUL
*/
