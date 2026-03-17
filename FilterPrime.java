import java.util.Arrays;
import java.util.stream.*;
public class FilterPrime{
    public static void main(String[] args) {
        int arr[] = {5,6,2,10};
        IntStream stream=Arrays.stream(arr);
        stream.filter(n-> isPrime(n)).forEach(System.out::println);
    }
    static boolean isPrime(int n){
        int count=0;
        if(n<=1) return false;
        for(int i=2;i<=n;i++){
            if(n%i==0) count++;
        }
        return count==1;
    }
}