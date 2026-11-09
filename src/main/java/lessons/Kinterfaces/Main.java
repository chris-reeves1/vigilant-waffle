package lessons.Kinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        
    
    // Airplane plane = new Airplane();
    // plane.fly();
    // Airplane plane = new Airplane();
    // Flyable drone = new Drone();

    // launch(drone);
    // launch(plane);

    // Drone drone = new Drone();

    // Flyable flyingObject = drone;
    // Operable operateObject = drone;

    //     flyingObject.fly(); 
    //     operateObject.Operate();

        //flyingObject.Operate(); // compile error - not exposed to flyable.

        // Bird b = new Parrot();
        // b.fly();
        // b.speak();

        // Animal dog = new Dog();
        // Animal cat = new Cat();

        // dog.eat();
        // dog.sleep(); // sleeping

        // cat.eat();
        // cat.sleep(); // cat sleeps

        // Display display = new Display();
        // display.show();

        // Logger logger = new Consolelogger();
        // App app = new App(logger);

        // app.run();

        Operation addWithClass = new Addition();

        Operation addWithLambda = (a, b) -> a + b; 
        Operation multiply = (a, b) -> a * b; 

        System.out.println(addWithClass.apply(1, 1));
        System.out.println(addWithLambda.apply(1, 2));
        System.out.println(multiply.apply(2,2 ));

        IntUnaryOperator add = (x) -> x + x;
        System.out.println(add.applyAsInt(1));

        Predicate<String> isShortWord = (s) -> {return s.length() <= 5;};
        System.out.println(isShortWord.test("1234")); // true
        System.out.println(isShortWord.test("123456")); // false

        String a = "[LOG] - ";
        Consumer<String> logger = (s) -> System.out.println(a + s);
        logger.accept("CRASHED!!");

        // streams:

        // - source
        // - intermediate steps - filter, map, sort, limits. 
        // - Terminal Operation - foreach, count, reduce. 

        List<String> names = Arrays.asList("Cffff", "Bff", "Affff");

        // for (String name : names){
        //     if (name.length() > 3){
        //         System.out.println(name.toUpperCase());
        //     }
        // }

        names.stream()
            .filter((n) -> n.length() > 3)
            .map(String::toUpperCase)
            .forEach(System.out::println);


}
    // public static void launch(Flyable item){
    //     item.fly();
    // }
}

class Addition implements Operation{
    @Override
    public int apply(int a, int b) {
        return a + b;
    }

}

// class App {
//     private final Logger logger;

//     public App(Logger logger){
//         this.logger = logger;
//     }

//     public void run(){
//         logger.log("app started");
//     } 
// }

// class Consolelogger implements Logger {
//     @Override 
//     public void log(String message){
//         System.out.println("[LOG] - " + message);
//     }
// }


// class Display implements A, B {
//     @Override 
//     public void show(){
//         A.super.show();
//     }
// }

// class Dog implements Animal {
//     @Override
//     public void eat(){
//         System.out.println("dog eats");
//     }
//     // inherits sleep() default method
// }

// class Cat implements Animal {
//     @Override
//     public void eat(){
//         System.out.println("cat eats");
//     }

//     @Override
//     public void sleep(){
//         System.out.println("cat sleeps");
//     }
// }





// class Airplane implements Flyable {
//     @Override
//     public void fly(){
//         System.out.println("airplane fly's");
//     }
// }

// class Drone implements Flyable, Operable {
//     @Override
//     public void fly(){
//         System.out.println("drone fly's");
//     }
//     @Override
//     public void Operate(){
//         System.out.println("drone operates.."); 
// }
// }

// class Parrot implements Bird {

//     @Override
//     public void fly() {
//         System.out.println("p flys");
//     }

//     @Override
//     public void speak() {
//         System.out.println("talks...");
//     }
    
// }


// // Interfaces:
//     - Contracts to implement abstracts.
//     - inherit state(final constants) + concrete methods.
//     - use implements keyword - can implement many. 
//     - Use a descriptive name.
//     - Code against the interface:
            // - prefer interface as the type
            // - expose only needed behaviour
    // - State are constants - try to change = compile error. 
    

     // lambdas  



    //  sc - iable 
    //  - overrides(abstracts)
    //  - inherit concretes. 
    //  =  NOT private
    //  = what if abstract sc? overrides(abstracts) == optional

    //  |
    //  bc 
    //  - implement unaccounted for abstracts. 
    //  - from iable must stay public. 
