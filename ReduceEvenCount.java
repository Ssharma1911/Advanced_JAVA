import java.util.*;
public class ReduceEvenCount{
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,10,4,5);
        Integer result=list.stream().reduce(0,(count,num)->(num%2==0)?count+1:count);
        System.out.println(result);
    }
}