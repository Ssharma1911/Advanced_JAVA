import java.util.Arrays;
import java.util.List;
public class MapstringLength {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("Sarthak", "Sumit", "Ujjwal", "Vishal", "Manish");
        List<Integer> result=list.stream().map(n->n.length()).toList();
        System.out.println(result);
    }
}