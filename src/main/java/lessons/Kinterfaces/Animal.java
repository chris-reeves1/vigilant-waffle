package lessons.Kinterfaces;

public interface Animal {
    void eat();

    default void sleep(){
        System.out.println("sleeping...");
    }
}
