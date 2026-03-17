class Calculator{
    int x,y;
    void Sum(int a,int b){
        x=a;
        y=b;
        System.out.println("Sum is: "+(x+y));
    }
    void Multiply(int a,int b){
        x=a;
        y=b;
        System.out.println("Product is: "+(x*y));
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.Sum(5, 10);
        calc.Multiply(5, 10);
    }
}