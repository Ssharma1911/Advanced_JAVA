import java.util.*;
public class ReduceEvenSum{
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,10,4,5);
        Integer result=list.stream().reduce(0,(sum,num)->(num%2==0)?sum+num:sum);
        System.out.println(result);
    }
}