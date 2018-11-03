package hw2;

/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class BottomStack {
    private int[] elements; //An array to store integers in the stack.
    private int size; //The number of integers in the stack.
    static final int DEFAULT_CAPACITY = 4;
    
    public BottomStack(){
        elements = new int[DEFAULT_CAPACITY];
        size = 0;
    }
    
    public BottomStack(int capacity){
        elements = new int[capacity];
        size = 0;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int peek() {
       return elements[0];
    }
    
    public void push(int value){
        if(size != elements.length){
            for(int i = size;i > 0;i--){
                elements[i] = elements[i-1];
            }
            elements[0] = value;
            size++;
        }
        else{
            int[] temp = new int[elements.length];
            for(int i = 0;i < elements.length;i++){
                temp[i] = elements[i];
            }
            elements = new int[DEFAULT_CAPACITY * 2];
            for(int i = 0;i < temp.length;i++){
                elements[i+1] = temp[i];
            }
            elements[0] = value;
            size++;
        }
    }
    
    public int pop(){
        int removedElement = elements[0];
        for(int i = 0;i < size - 1;i++){
            elements[i] = elements[i+1];
        }
        elements[size - 1] = 0;
        size--;
        return removedElement;
    }
    
    public int getSize(){
        return size;
    }
    
    public String toStringAll(){
        String s = "";
        for(int i = 0;i<elements.length;i++){
            s += elements[i] + " ";
        }
        return s;
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i = 0;i<size;i++){
            s += elements[i] + " ";
        }
        return s;
    }
}
