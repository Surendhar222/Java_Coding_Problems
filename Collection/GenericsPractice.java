package Collection;

interface MyInterface<T extends Comparable<T>> {
    T min();
    T max();
}
public class GenericsPractice<T extends Comparable<T>> implements MyInterface<T> {
    T[] array;
    GenericsPractice(T[] array){
        this.array = array;
    }
	public T min(){
        T val = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(val) < 0) {
                val = array[i];
            }
        }
        return val;
    }

    public T max(){
        T val = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(val) > 0) {
                val = array[i];
            }
        }
        return val;
    }

    public static void main(String[] args) {
        Integer[] min = {1,2,3,4,5,6,7,8};
        Character[] minch = {'a' , 'b', 'c' , 'd' , 'e' , 'f'};
        GenericsPractice<Integer> gen = new GenericsPractice<>(min);
        GenericsPractice<Character> gench = new GenericsPractice<>(minch);
        System.out.println(gen.min());
        System.out.println(gen.max());
        System.out.println(gench.min());
        System.out.println(gench.max());
    }
}