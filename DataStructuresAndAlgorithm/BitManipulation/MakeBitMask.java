package DataStructuresAndAlgorithm.BitManipulation;

public class MakeBitMask {
	public static void main(String[] args) {
        onMask();
        offMask();
    }
    private static void onMask(){
        int number = 36;
        int i = 3;         // here ith bit we have to on so OR(|) Operation
        int onMask = 1<<i;
        System.out.println(number | onMask);
    }

    private static void offMask(){
        int number = 36;
        int i = 5;        // here ith bit we have to off so AND(&) operation
        int onMask = ~(1<<i);
        System.out.println(number & onMask);
    }
}