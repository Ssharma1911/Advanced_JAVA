interface Calculator{
    static square(int n){
        System.out.println(n*n);
    }
    static cube(int n){
        System.out.println(n*n*n);
    }

}
class Demo implements Calculator{
    public static void main(String[] args){
        Calculator.square(10);
        Calculator.cube(10);

    }
}