package DataStructuresAndAlgorithm;

public class DigitToBinaryConversion {
	public static void main(String[] args) {
        int digit = 45;
        String s = "";
        while (digit >=1) {
            int x = digit % 2;
            s = x+s;
            digit = digit/2;
        }
        System.out.println(s);
    }
}