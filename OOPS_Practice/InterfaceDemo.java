package OOPS_Practice;

public class InterfaceDemo extends AbsDemo implements B , A{
	public static void main(String[] args) {
        InterfaceDemo id = new InterfaceDemo();
        System.out.println(id.sum());
        B.m1();
        AbsDemo.sum1();
    }
    public void hello(){
        System.out.println("Hello");
    }
    public int sum(){
        return 20;
    }
    public void hi(){
        System.out.println("Helloooo");
    }
   
    static class Inner implements A{
        public void hello(){
            System.out.println("");
        }
    }
}