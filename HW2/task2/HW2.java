package hw2;

/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class HW2 {

    public static void main(String[] args) {     
        int[] n1 = {3, 4, 5};
        int[] n2 = {3, 4, 5, 6};
        int[] n3 = {0, 0, 5, 6, 0, 0, 0};
        int[] n4 = {0, 0, 0, 0, 0};
        MyBigNumber num1 = new MyBigNumber(n1);
        MyBigNumber num2 = new MyBigNumber(n2);
        MyBigNumber num3 = new MyBigNumber(n3);
        MyBigNumber num4 = new MyBigNumber(n4);
        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        System.out.println("num3 : " + num3);
        System.out.println("num4 : " + num4);
        System.out.println(num1 + " == " + num1 + " : " + num1.equals(num1));
        System.out.println(num1 + " == " + num2 + " : " + num1.equals(num2));
        System.out.println(num1 + " > " + num2 + " : " + num1.greater(num2));
        System.out.println(num2 + " > " + num1 + " : " + num2.greater(num1));
        System.out.println(num1 + " + " + num2 + " = " + num1.addition(num2));
        System.out.println(num2 + " + " + num1 + " = " + num2.addition(num1));
        System.out.println("| " + num1 + " - " + num2 + " | = "
        + num1.absolute_difference(num2));
         System.out.println("| " + num2 + " - " + num1 + " | = "
        + num2.absolute_difference(num1));
         System.out.println("| " + num3 + " - " + num2 + " | = "
        + num3.absolute_difference(num2));
         System.out.println("| " + num1 + " - " + num1 + " | = "
        + num1.absolute_difference(num1));
    }
}
