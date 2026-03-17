import java.util.Arrays;
import java.util.stream.*;
public class FilterSalary{
    public static void main(String[] args) {
        int arr[] = {50000,55000,20000,30000,40000,60000};
        IntStream stream=Arrays.stream(arr);
        stream.filter(n-> n>50000).forEach(System.out::println);
    }
}