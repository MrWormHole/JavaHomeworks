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
        BottomStack stack = new BottomStack();
        
        //output 1
        System.out.println(stack.toStringAll());
        for(int i = 11; i < 17; i++){
            stack.push(i);
            System.out.println(stack.toStringAll());
        }
        while(!stack.isEmpty()){
            stack.pop();
            System.out.println(stack.toStringAll());
        }
        System.out.println("");
        
        //output2
        for(int i = 11; i <17; i++){
            stack.push(i);
            System.out.println(stack.toString());
        }
        while(!stack.isEmpty()){
            stack.pop();
            System.out.println(stack.toString());
        }
    }
}
