sealed class Person permits Employee,Student{
    void display(){
        System.out.println("I am a person");
    }
}
final class Employee extends Person{
    void display(){
        System.out.println("I am an employee");
    }
}
final class Student extends Person{
    void display(){
        System.out.println("I am a student");
    }
}
public class Sealed_example{
    public static void main(String[] args){
        Person p=new Employee();
        p.display();
        Person p1=new Student();
        p1.display();
    }
}
