import java.util.Arrays;
import java.util.List;
public class MapstringTitle {
    public static void main(String[] args) {
        List<String> list =Arrays.asList("sarthak", "sumit", "ujjwal", "vishal", "manish");
        List<String> result=list.stream().map(n->toTitle(n)).toList();
        System.out.println(result);
    }
    public static String toTitle(String s){
        String title=s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        return title;
    }
}