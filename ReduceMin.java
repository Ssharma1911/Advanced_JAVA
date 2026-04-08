import java.util.*;
public class ReduceMin{
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,10,4,5);
        Integer result=list.stream().reduce(Integer.MAX_VALUE,(min,num)->(min<num)?min:num);
        System.out.println(result);
    }
}