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
class Manager extends Employee{
    Manager(int y){
        super(20);
        System.out.println(y);
    }
}
public class Multilevel{
    public static void main(String[] args) {
        Manager m = new Manager(30);
    }
}