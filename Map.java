package StreamAPI;
import java.util.*;
import java.util.stream.*;
public class Map {
    public static void main(String args[]){
        List<Integer>list=Arrays.asList(1,2,3,4);
        list.forEach(System.out::println);
        list.stream().map(i->i*2).forEach(System.out::println);//the stream modified by the map function is printed//
        list.forEach(System.out::println);//the List "list" does not have any changes//
        //Transferring to a list//
        List<Integer>doubledList=list.stream().map(x->x*2).toList();
        doubledList.forEach(System.out::println);
        List<String>values=Arrays.asList("Aman","Raman","Chaman","Suresh");
        List<String>values1=values.stream().map(String::toUpperCase).toList();//OR_____ .map(i->i.toUpperCase()).toList());//
        values1.forEach(System.out::println);
    }
}
