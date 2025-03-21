package String1;

import java.util.Arrays;
import java.util.Scanner;

final public class String1 {
    char[] arr = new char[100];
    String1(){

    }
	String1(char[] arr){
        //this.modify(arr);
        this.arr = arr;
    }

    /*public String1 modify(char[] arr){
        if(this.arr.equals(arr)){
        this.arr = arr;
        return this;
    }
        return new String1(arr);
    }*/

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj instanceof String1){
            String1 var = (String1)obj;
        for (int i = 0; i < arr.length; i++) {
            if(this.arr[i] != var.arr[i]){
                return false;
            }
        }
        }
        return true;
    }

    private String1 subString(int sIdx , int eIdx){
        char[] temp = new char[eIdx - sIdx];
        int count = 0;
        for (int i = sIdx; i < eIdx; i++) {
            temp[count++] = arr[i];
        }
        return new String1(temp);
    }

    private int length(){
       return arr.length;
    }

    public int indexOf(char ch){
        for (int i = 0; i < arr.length; i++) {
            if(this.arr[i] == ch){
                return i;
            }
        }
        return -1;
    }

    public int firstIndexOf(char ch){
        for (int i = 0; i < arr.length; i++) {
            if(this.arr[i] == ch){
                return i;
            }
        }
        return -1;
    }

    public int LastIndexOf(char ch){
        for (int i = arr.length-1; i >=0 ; i--) {
            if(this.arr[i] == ch){
                return i;
            }
        }
        return -1;
    }

    public char charAt(int index){
        if(index > arr.length-1){throw new ArrayIndexOutOfBoundsException();}
        return arr[index];
    }

    private String1 toUpperCase(){
        int idx = 0;
        char[] temp = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z'){
                temp[idx++] = (char)(this.charAt(i)-' ');
            }
            else{
                temp[idx++] = this.charAt(i);
            }
        }
        return new String1(temp);
    }

    private String1 toLowerCase(){
        char[] temp = new char[arr.length];
        for (int i = 0; i < temp.length; i++) {
            if(arr[i] >= 'A' && arr[i] <= 'Z'){
                temp[i] = (char)(this.charAt(i)+' ');
            }
            else{
                temp[i] = this.charAt(i);
            }
        }
        return new String1(temp);
    }

    private String1 replace(int idx , char ch){
        arr[idx] = ch;
        return new String1(arr);
    }

    private String1 replaceAll(char oldCh , char newCh){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == oldCh){
                arr[i] = newCh;
            }
        }
        return new String1(arr);
    }

    private String1 trim(){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ' '){
                count++;
            }
        }
        char[] temp = new char[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != ' '){
                temp[idx++] = arr[i];
            }
        }
        return new String1(temp);
    }

    private String1 concat(char[] brr){
        char[] temp = new char[arr.length + brr.length];
        for (int i = 0; i < temp.length; i++) {
            if(i < arr.length){
                temp[i] = arr[i];
            }
            else{
                temp[i] = brr[i];
            }
        }
        return new String1(temp);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]+" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        char arr[] = new char[5];
        System.out.println("Enter the Characters");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next().charAt(0);
        }*/
        String1 s = new String1(new char[]{'A','b','C','a'});
        String1 s1 = new String1(new char[]{'a','B','c','D'});
        String1 s2 = new String1(new char[]{' ',' ',' ','a','b','c','a',' ',' ',' '});
        System.out.println(s.length());
        System.out.println(s.indexOf('b'));
        System.out.println(""+s.charAt(2));
        System.out.println(s.subString(0, 2));
        System.out.println(s.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s.firstIndexOf('a'));
        System.out.println(s.LastIndexOf('a'));
        System.out.println(s.replace(1, 'z'));
        System.out.println(s.replaceAll('a', 'M'));
        System.out.println(s2.trim());
        char[] arr = {'a','b','c'};
        System.out.println(Arrays.toString(arr));
        System.out.println(s.equals(s2));
        
    }
}