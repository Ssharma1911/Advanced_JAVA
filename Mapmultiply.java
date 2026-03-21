import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class Mapmultiply {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> result=list.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(result);
    }
}