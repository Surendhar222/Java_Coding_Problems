package Collection;

public class Doctor implements CustomSorting{
	int id;
    String name;

    public Doctor(int id , String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    public String toString(){
        return ""+id + name;
    }
}