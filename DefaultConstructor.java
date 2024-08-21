package StreamAPI;

public class DefaultConstructor {
    public static void main(String args[]){
        Actor a=new Hero();//polymorphism : object is treated as an instance of its superclass//
        Actor b=new Villain();
        a.act();//dynamic method dispatch:when we call a.act Java determines at runtime which act() method to call. Since 'a' is
        // actually a 'Hero' object the act() method of 'Hero' is class in invoked.//
        b.act();
        a.comedy();
        b.comedy();
    }
}
