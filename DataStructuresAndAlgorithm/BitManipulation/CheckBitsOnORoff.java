package DataStructuresAndAlgorithm.BitManipulation;

public class CheckBitsOnORoff {
	public static void main(String[] args) {
        checkBitsOnOroff();
    }

    private static void checkBitsOnOroff(){
        int number = 36;
        int i = 5;
        int bitMask = 1<<i;

        if ((number & bitMask) == 0) {
            System.out.println("OFF");
        }
        else{
            System.out.println("ON");
        }
    }
}