import java.util.stream.*;
public class FilterSquares{
    public static void main(String[] args){
        Stream<Integer> list=Stream.of(10, 20, 30, 40, 50);
        list.filter(x->(x*x)>500).forEach(n->System.out.println(n));
    }
}