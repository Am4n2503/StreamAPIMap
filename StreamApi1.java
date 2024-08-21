package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class StreamApi1 {
    public static void main(String args[]){
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i);
        }
        list.stream().forEach(System.out::println);
        List<Integer>li=Arrays.asList(1,2,4,3,7,6,5,9);
        Stream<Integer>s=li.stream();
        s.forEach(System.out::println);
        try {
            s.forEach(System.out::println);//same stream cannot be consumed twice//
        }
        catch(IllegalStateException e){
            System.out.println(e.getMessage());
        }
    }
}
