package hw2;

/**
* @instructor Eliya Büyükkaya
* 
*
* @contributor  F.Talha Altınel
* @number 20161701034
*/

public class MyBigNumber {
    private int[] digits; //1,4,6,5 but it will be look like 5,6,4,1 
    //boolean redundancyOfZerosFinished;
    boolean expectRedundancy;
    
    public MyBigNumber(int[] arr){
        if(allAreZeros(arr)){
            digits = new int[1];
            digits[0] = 0;
        }
        else{
            int len = calculateLengthForDigits(arr);
            constructDigitsArray(arr,len);
            reverseAnArray(digits);
        }
    }
    
    public int calculateLengthForDigits(int[] arr){
        int c = 0;
        expectRedundancy = true;
        for(int i = arr.length - 1;i > -1; i--){
            if(arr[i] == 0 && expectRedundancy){
                continue;
            }
            
            if(arr[i] != 0){
                c++;
                expectRedundancy = false;
            }
            else if(arr[i] == 0 && !expectRedundancy){
                c++;
            }
        }
        return c;
    }
    
    public void constructDigitsArray(int[] arr,int len){
        digits = new int[len];
        for(int i = 0;i<digits.length;i++){
            digits[i] = arr[i];
        }
    }
    
    public int[] reverseAnArray(int[] arr){
        for(int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        return arr;
    }
    
    public boolean allAreZeros(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i] == 0){
                if(i == arr.length-1){
                    return true;
                }
            }
            else{
                break;
            }
        }
        return false;
    }
    
    public int getDigitsLength(){
        return digits.length;
    }
    
    public int getDigitsByIndex(int i){
        return digits[i];
    }
    
    public boolean equals(MyBigNumber other){
        if(this.digits.length != other.getDigitsLength()){
            return false;
        }
        
        for(int i = 0;i<this.digits.length;i++){
           if(this.digits[i] == other.getDigitsByIndex(i)){
               if(i == this.digits.length - 1){
                   return true;
               }
           }
           else{
               break;
           }
        }
        return false;
    }
    
    public boolean greater(MyBigNumber other){
        if(this.digits.length > other.getDigitsLength()){
            return true;
        }
        else if(this.digits.length == other.getDigitsLength()){
            for(int i = 0;i < this.digits.length;i++){
                if(this.digits[i] > other.getDigitsByIndex(i)){
                    return true;
                }
                else if(this.digits[i] < other.getDigitsByIndex(i)){
                    break;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString(){
        String s = "";
        for(int i=0;i<digits.length;i++){
            s += digits[i];
        }
        return s;
    }
    
    public MyBigNumber addition(MyBigNumber other){
        int val1 = Integer.parseInt(this.toString()); 
        int val2 = Integer.parseInt(other.toString());  
        //7086
        String temp = Integer.toString(val1+val2);
        int[] newArrForObjCreation = new int[temp.length()];
        for(int i = 0 ; i < temp.length();i++){
            newArrForObjCreation[i] = Character.getNumericValue(temp.charAt(i));
        }
        newArrForObjCreation = reverseAnArray(newArrForObjCreation); 
        
        return new MyBigNumber(newArrForObjCreation); //6807
    }
    
    public MyBigNumber absolute_difference(MyBigNumber other){
        int val1 = Integer.parseInt(this.toString());
        int val2 = Integer.parseInt(other.toString());
        
        String temp = Integer.toString(Math.abs(val1 - val2));
        int[] newArrForObjCreation = new int[temp.length()];
        for(int i = 0 ; i < temp.length();i++){
            newArrForObjCreation[i] = Character.getNumericValue(temp.charAt(i));
        }
        newArrForObjCreation = reverseAnArray(newArrForObjCreation);
        
        return new MyBigNumber(newArrForObjCreation);
    }
    
    
}
