import java.util.ArrayList;
import java.util.stream.*;
public class StringContains {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sarthak");
        list.add("Sumit");
        list.add("Ujjwal");
        list.add("Vishal");
        list.add("Manish");
        Stream<String> stream = list.stream();
        stream.filter(n-> n.contains("a")).forEach(System.out::println);
    }
}