package StreamAPI;
import java.util.*;

public class ForEach {
    public static void main(String args[]){
//        List<Employee>list=new ArrayList<>();
//        list.add(new Employee("Aman",2101));
//        list.add(new Employee("Saurabh",2102));
//        list.add(new Employee("Rohan",2103));
//        //for printing the above list, we need to override the toString method in Employee class to display the names as per our choice//
//        System.out.println(list);
//        List<String>names=new ArrayList<>();
//        for(Employee emp:list){
//            names.add(emp.getName());
//        }
//        for(String name:names){
//            System.out.println(name);
//        }
        //EXTERNAL ITERATIONS//
        List<Integer>li=Arrays.asList(1,2,3,4,5,6,7,8,9);
//        for(int i=0;i<li.size();i++){
//            System.out.println(li.get(i));
//        }
//        Iterator<Integer>i=li.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
//        for(int it:li){
//            System.out.println(it);
//        }
        //INTERNAL ITERATION//
        //ForEach METHOD//
        //WORKING OF FOREACH METHOD USING CONSUMER INTERFACE//
//        Consumer<Integer>c=new Consumer<Integer>()
//        {
//            public void accept(Integer i){
//                System.out.println(i);
//            }
//        };
//        li.forEach(c);
        //LAMBDA EXPRESSION FUNCTIONAL INTERFACE//
//        Consumer<Integer>c=x->System.out.println(x);
        li.forEach(x->doubleIt(x));

        //METHOD REFERENCE//
        li.forEach(System.out::println);//passing method reference(println) as argument//
        li.forEach(ForEach::doubleIt);//implementing the below method using method reference//
        System.out.println();
    }
    public static void doubleIt(int i) {
        System.out.println(i * 2);
    }

}
