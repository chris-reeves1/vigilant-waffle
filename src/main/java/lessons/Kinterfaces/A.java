package lessons.Kinterfaces;

public interface A {

    default void show(){
        System.out.println("A's default");
    }
}
