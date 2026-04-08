import java.util.*;
public class ReduceMax{
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,10,4,5);
        Integer result=list.stream().reduce(0,(max,num)->(max>num)?max:num);
        System.out.println(result);
    }
}