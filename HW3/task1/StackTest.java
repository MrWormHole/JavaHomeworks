/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/
package task1;
import java.util.ArrayList;

public class StackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        runStack(stack);

        MyStackBottom stack2 = new MyStackBottom();
        runStack(stack2);
     }

     public static void runStack(MyStack stack) {
        if (!(stack instanceof MyStackBottom)) {
            System.out.println("STACK TOP");
        }else {
            System.out.println("STACK BOTTOM");
        }

        System.out.println(stack);
        for (int i = 10; i < 60; i += 10) {
            System.out.println("push " + i);
            stack.push(i);
            System.out.println(stack);
        }

        while (!stack.isEmpty()) {
            System.out.println("pop " + stack.pop());
            System.out.println(stack);
        }
        System.out.println("");
    }
}

// Implementing a stack using inheritance
// Do NOT add any other data fields
class MyStack extends ArrayList<Integer> {

    private String name;

    // IMPORTANT! only use constructor this, here.
    public MyStack() {
        this("STACK TOP");
    }

    public MyStack(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Test whether the stack is empty
    public boolean isEmpty() {
       return this.size() == 0;
    }

    // Return the number of elements in the stack
    public int getSize() {
        return this.size();
    }

    // Return the "top" element from the stack
    public Integer peek() {
        return this.get(this.size() - 1);
    }

    // Return and remove the "top" element from the stack
    public Integer pop() {
        Integer res = peek();
        this.remove(get(this.size()-1));
        return res;
    }

    // Push a new integer into the "top" of the stack
    public void push(Integer o) {
       this.add(o);
    }

    // Return a String representation of the elements in the stack
    public String toString() {
        String res = "";
        res += "stack : [";
        for(int i = 0 ; i < this.size(); i++){
            if(i == this.size() - 1){
                res += this.get(this.size() - 1);
                break;
            }
            res += this.get(i) + ",";
        }
        res += "]";
        return res;
    }

}

/* 
Implementing a bottom stack using inheritance
Elements are pushed into the "bottom" of the stack
Elements are popped from the "bottom" of the stack
IMPORTANT! This class contains ONLY FOUR methods:
- constructor
- peek
- pop
- push
*/

class MyStackBottom extends MyStack {
    public MyStackBottom(){
        super("STACK BOTTOM");
    }
    
    @Override
    public Integer peek(){
        return this.get(0);
    }
    
    @Override
    public Integer pop(){
        Integer res = peek();
        this.remove(res);
        return res;
    }
    
    @Override
    public void push(Integer o){
        this.add(0,o);
    }
}

/* You should get the following output:
------
run:
STACK TOP
stack: []
push 10
stack: [10]
push 20
stack: [10, 20]
push 30
stack: [10, 20, 30]
push 40
stack: [10, 20, 30, 40]
push 50
stack: [10, 20, 30, 40, 50]
pop 50
stack: [10, 20, 30, 40]
pop 40
stack: [10, 20, 30]
pop 30
stack: [10, 20]
pop 20
stack: [10]
pop 10
stack: []

STACK BOTTOM
stack: []
push 10
stack: [10]
push 20
stack: [20, 10]
push 30
stack: [30, 20, 10]
push 40
stack: [40, 30, 20, 10]
push 50
stack: [50, 40, 30, 20, 10]
pop 50
stack: [40, 30, 20, 10]
pop 40
stack: [30, 20, 10]
pop 30
stack: [20, 10]
pop 20
stack: [10]
pop 10
stack: []

BUILD SUCCESSFUL (total time: 0 seconds)
*/