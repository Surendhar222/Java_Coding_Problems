package DataStructuresAndAlgorithm;

public class BinaryToDigit {
    public static void main(String[] args) {
        String binary = "101101";
        int result = 0;
        int powOf2 = 1;
        for (int i = binary.length()-1; i >= 0 ; i--) {
            if (binary.charAt(i) == '1') {
                result = result + powOf2;
            }
            powOf2 = powOf2 * 2;
        }
        System.out.println(result);
    }
}