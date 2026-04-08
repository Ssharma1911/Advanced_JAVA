import java.util.*;
public class ReduceProductsquare{
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,10,4,5);
        Integer result=list.stream().reduce(1,(product,num)->{
            return product*num*num;
        });
        System.out.println(result);
    }
}