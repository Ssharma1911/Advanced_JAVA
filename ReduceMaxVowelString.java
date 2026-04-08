import java.util.*;
public class ReduceMaxVowelString{
    public static void main(String[] args){
        List<String>list=Arrays.asList("Helloo","World","Java");
        Optional<String> result = list.stream().reduce((s1, s2) -> Countvowel(s1) > Countvowel(s2) ? s1 : s2);
        System.out.println(result);
    }
    static int Countvowel(String str){
        int count=0;
        for(char ch:str.toCharArray()){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        return count;
    }
}