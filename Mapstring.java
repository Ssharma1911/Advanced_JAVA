import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Mapstring {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Sarthak", "Sumit", "Ujjwal", "Vishal", "Manish");
        List<String> result=list.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}