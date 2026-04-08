import java.util.*;
public class ReduceConcatenate{
    public static void main(String[] args){
        List<String>list=Arrays.asList("Hello","World","Java");
        String result=list.stream().reduce("",(cc,str)->cc+" "+str);
        System.out.println(result);
    }
}