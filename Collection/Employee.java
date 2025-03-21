package Collection;

public class Employee implements CustomSorting{
	int id;
    String name;

    Employee(int id , String name){
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

    public int hashCode(){
        return 1;
    }

    public boolean equals(Object obj){
        if (obj instanceof Employee) {
            Employee emp = (Employee)obj;
            System.out.println(emp.id+" "+emp.name);
            System.out.println(this.id+" this "+this.name);
            if (this.id == emp.id) {
                if (this.name == emp.name) {
                    return true;
                }
            }
        }
        return false;
    }
}