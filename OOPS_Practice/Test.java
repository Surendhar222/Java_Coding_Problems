package OOPS_Practice;

public class Test extends AbsDemo{
	public static void main(String[] args) {
        A a = new Test();
        a.hello();
        
        String s = "java";
        String s1 = new String("java");
        String s2 = new String("java");
        System.out.println(s2 == s1);
        System.out.println(s.equals(s1));
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
    public void hello(){
        System.out.println(123);
    }
}