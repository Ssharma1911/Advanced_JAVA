class Person{
    Person(int a){
        System.out.println(a);
    }
}
class Employee extends Person{
    Employee(int x){
        super(10);
        System.out.println(x);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Employee e = new Employee(20);
    }
}