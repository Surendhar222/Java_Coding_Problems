package DataStructuresAndAlgorithm.BitManipulation;

public class ToggleBits {
	public static void main(String[] args) {
        toggleBits();
    }

    private static void toggleBits(){
        int number = 36;
        int i = 5;
        int toggleMask = 1<<i;

        System.out.println(number ^ toggleMask);
    }
}