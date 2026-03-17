Record Employee(int id, String name, double salary) {
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", 50000.0);
        Employee emp2 = new Employee(2, "Bob", 60000.0);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}