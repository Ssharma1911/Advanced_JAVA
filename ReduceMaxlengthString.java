import java.util.*;
public class ReduceMaxlengthString{
    public static void main(String[] args){
        List<String>list=Arrays.asList("Helloo","World","Java");
        Optional<String> result = list.stream().reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);
        System.out.println(result);
    }
}