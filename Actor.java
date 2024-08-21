package StreamAPI;
public interface Actor{
    void act();
    void speak();
    default void comedy(){//default method can be defined inside an interface//
        System.out.println("Laugh");
    }
}

