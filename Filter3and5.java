import java.util.ArrayList;
import java.util.stream.*;
public class Filter3and5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(12);
        list.add(18);
        list.add(15);
        list.add(30);
        Stream<Integer> stream = list.stream();
        stream.filter(n-> n%3==0 && n%5!=0).forEach(System.out::println);
    }
}