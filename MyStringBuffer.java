package MyStringBuffer;

public class MyStringBuffer {
	private char[] arr;

    // Empty Constructor
    MyStringBuffer(){
        this.arr = new char[16];
    }

    // Initial Capacity Constructor
    MyStringBuffer(int initialCapacity){
        if(initialCapacity < 0){
            throw new NegativeArraySizeException();
        }
        this.arr = new char[initialCapacity];
    }

    // String Equivalent Constructor
    MyStringBuffer(String s){
        this.arr = new char[16 + s.length()];
        for (int i = 0; i < s.length(); i++) {
            this.arr[i] = s.charAt(i);
        }
    }

    private char[] increaseCapacity(){
        int size = (this.arr.length+1)*2; 
        char[] temp = new char[size];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    private int remainingCapacity(){
        return this.arr.length - this.length();
    }

    // Overridden toString() method 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    // Returns Length
    private int length(){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                count++;
            }
        }
        return count;
    }
    // Returns Capacity
     private int capacity(){
        return arr.length;
     }

     // CharAt Method
     private char charAt(int index){
        if(index < 0 && index > arr.length){
            throw new StringIndexOutOfBoundsException();
        }
        return this.arr[index];
     }

     //setCharAt Method
     private void setCharAt(int index , char newChar){
        this.arr[index] = newChar;
     }

     //Append() Method String
     private MyStringBuffer append(String s){
        if(s.length() > remainingCapacity()){
            arr = this.increaseCapacity();
        }
        int startIndex = this.length();
        int idx = 0;
        for (int i = 0 ; i < arr.length && i < s.length(); i++) {
            this.arr[startIndex++] = s.charAt(idx++);
        }
        return this;
     }

     //Append() method for Integer
      private MyStringBuffer append(int i){
        if(this.length() > remainingCapacity()){
            arr = this.increaseCapacity();
        }
        int startIndex = this.length();
        // System.out.println(startIndex);
        int count = 0;
        int val = i;
        while(val != 0){
            int a = val%10;
            count++;
            val = val/10;
        }
        char temp[] = new char[count];
        int idx = 0;
        while(i != 0){
            int a = i % 10;
            temp[idx++] = (char)(a + 48);
            i = i / 10;
        }
        for(int j = temp.length-1 ; j >= 0 ; j--){
            arr[startIndex++] = temp[j];
        }
        return this;
     }

     // Append() method for char
     private MyStringBuffer append(char ch){
        if(this.length() > remainingCapacity()){
            arr = this.increaseCapacity();
        }
        int startIndex = this.length();
        arr[startIndex++] = ch;
        return this;
     }

     // Append() Method for boolan
     private MyStringBuffer append(boolean bool){
        if(this.length() > remainingCapacity()){
            arr = this.increaseCapacity();
        }
        int startIndex = this.length();
        if(bool){
            char[] boolArray = {'t','r','u','e'};
            for (int i = 0; i < boolArray.length; i++) {
            arr[startIndex++] = boolArray[i];
            }
        }
        else{
            char[] boolArray = {'f','a','l','s','e'};
            for (int i = 0; i < boolArray.length; i++) {
            arr[startIndex++] = boolArray[i];
            }
        }
        return this;
     }

     //deleteCharAt() Method
     private MyStringBuffer deleteCharAt(int index){
        if(index < 0 && index > arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < this.arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        return this;
     }

     //Reverse() Method
     private MyStringBuffer reverse(){
        int i = 0 , j = arr.length-1;
        while(i <= j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return this;
     }

     //subString() Method
     private String subString(int start){
        MyStringBuffer sb = new MyStringBuffer();
        for (int i = start; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
     }

     //subString() Method
     private String subString(int start , int end){
        MyStringBuffer sb = new MyStringBuffer();
        for (int i = start; i < end; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
     }

     //indexOf() Method for String
     private int indexOf(String str){
        int idx = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length && idx < str.length(); i++) {
            flag = false;
            if(arr[i] == str.charAt(idx)){
                flag = true;
                idx++;
            }
            else{
                idx = 0;
            }
        }
        if(flag){
            return this.length() - str.length();
        }
        return -1;
     }

     //indexOf() Method for String Using Start Index
     private int indexOf(String str , int startIndex){
        int idx = 0;
        boolean flag = false;
        for (int i = startIndex; i < arr.length && idx < str.length(); i++) {
            flag = false;
            if(arr[i] == str.charAt(idx)){
                flag = true;
                idx++;
            }
            else{
                idx = 0;
            }
        }
        if(flag){
            return this.length() - str.length();
        }
        return -1;
     }

     //lastIndexOf() Method for String
     private int lastIndexOf(String str){
        int idx = 0;
        boolean flag = false;
        for (int j = arr.length-1; j >= 0; j--) {
            if(arr[j] == str.charAt(0)){
        for (int i = 0; i < arr.length && idx < str.length(); i++) {
            flag = false;
            if(arr[i] == str.charAt(idx)){
                flag = true;
                idx++;
            }
            else{
                idx = 0;
            }
        }
        if(flag){
            return this.length() - str.length();
        }
            }
        }
        return -1;
     }

     //lastIndexOf() Method for String
     private int lastIndexOf(String str , int startIndex){
        int idx = 0;
        boolean flag = false;
        for (int j = arr.length-1; j >= startIndex; j--) {
            if(arr[j] == str.charAt(0)){
        for (int i = 0; i < arr.length && idx < str.length(); i++) {
            flag = false;
            if(arr[i] == str.charAt(idx)){
                flag = true;
                idx++;
            }
            else{
                idx = 0;
            }
        }
        if(flag){
            return this.length() - str.length();
        }
            }
        }
        return -1;
     }

    public static void main(String[] args) {
        MyStringBuffer sb = new MyStringBuffer("hello");
        MyStringBuffer sb2 = new MyStringBuffer("he lloSurendharSur endharSurendhar");
        MyStringBuffer sb1 = new MyStringBuffer();
        System.out.println(sb.length());
        System.out.println(sb.remainingCapacity());
        sb.setCharAt(0, 'S');
        System.out.println(sb);
        sb.append("Surendhar");
        sb.append(10000);
        sb.append('M');
        sb.append(false);
        sb.deleteCharAt(0);
        sb.deleteCharAt(0);
        System.out.println(sb);
       // System.out.println(sb.reverse());
        System.out.println(sb.subString(10));
        System.out.println(sb.subString(10 , 20));
        System.out.println(sb2.indexOf("Surendhar"));
    }
}