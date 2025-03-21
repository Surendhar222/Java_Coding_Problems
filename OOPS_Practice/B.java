package OOPS_Practice;

public interface B extends A{
    void hi();
	default int sum(){
        return 10;
    }
    public static void m1(){
        System.out.println("Iam from Interface B");
    }
}