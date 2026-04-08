import java.util.*;
public class ReduceMultiply{
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,3,4,5);
        Integer result=list.stream().reduce(1,(fac,num)->fac*num);
        System.out.println(result);
    }
}