import java.util.List;
import java.util.stream.*;
public class CollectExample {
    public static void main(String[] args) {
        List<Integer> evennumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evennumber);
    }
}   