package StreamAPI;

import java.util.*;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String args[]){
        List<Integer>values=Arrays.asList(1,3,5,7,9);
        //sum of all the element using for each loop//
        int result=0;
       for(int i:values){
           result+=i;
       }
       System.out.println(result);

       //sum of all values using reduce with ANNONYMOUS CLASS//
//        int sum2=values.stream().reduce(0, new BinaryOperator<Integer>(){
//            public Integer apply(Integer a,Integer b){
//                return a+b;
//            }
//        });
//        System.out.println(sum2);

        //REDUCE USING LAMBDA EXPRESSION//
        int sum=values.stream().reduce(0,(a,b)->a+b);//just one line of code//
        //0 is the Identity or Initial Value, a and b are the integer type parameters of apply method of BinaryOperator<Integer> Interface, and a+b is the return value//
        System.out.println(sum);

        //Using the method reference//

        int sum1=values.stream().reduce(0,Integer::sum);//
        System.out.println(sum1);

        //multiplying of each number to another//
        int mult=values.stream().reduce(1,(a,b)->a*b);//initial value 1 , as we are multiplying//
        System.out.println(mult);

        int mult1=values.stream().reduce(1,MathUlis::multiply);//for using method refrence I created a class MathUlis with a method named multiply to implement method refrence here
        //since Integer class does not have an inbuilt mulitplication method in it//
//
    }
}
