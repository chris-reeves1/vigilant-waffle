package lessons.Iinheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Inheritance:
        // superClass - attr, constructors, methods.(1)
        // subClass extends superClass - inherits all from parent + 
       //                            adds own attr, constructors, methods.(many)

        // Final classes cannot be extened.
        // Final methods cannot be overridden.

        // prefer has-a, over is-a
        // inheritance = coupling. 
        // prefer shallow over deep chains. 
        
        // Dog dog  = new Dog();
        // dog.name = "rosie";

        // dog.bark();
        // dog.eat();

        // Car car = new Car();
        // car.speed = 100;

        // car.displaySpeed();
        // car.displaySuperSpeed();

        // Dog dog1 = new Dog("rosie");
        // Dog dog2 = new Dog("buzz", 1);

        // System.out.println(dog1);
        // System.out.println(dog2);

        // Animal myDog = new Dog();
        // ref is animal java is led by the ref type.
        // obj is and remains in memory a dog.
        // behaviour is constained to aninmal. 

        // myDog.fetch(); 

        // List<Animal> animals = new ArrayList<>();
        
        // animals.add(new Animal());
        // animals.add(myDog);
        // animals.add(new Cat());

        // // overidden methods are available.
        // for (Animal animal : animals){
        //     animal.speak();
        // }

        // downcasting

//             Animal animal = new Dog();
            
//             System.out.println(animal instanceof Dog); //true

//             if (animal instanceof Dog){
//                 Dog dog = (Dog) animal;

//                 System.out.println(animal == dog); //true
//                 dog.wags();
//             }

    }
 }

// basic example
// class Animal {
//     protected String name;

//     public void eat() {
//         System.out.println(name + " is eating.");
//     }
// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println(name + " is barking.");
//     }
// }

// class Vehicle {
//     protected int speed;

//     public void displaySpeed() {
//         System.out.println("Vehicle speed: " + speed);
//     }
// }

// class Car extends Vehicle {
//     @Override
//     public void displaySpeed(){
//         System.out.println("Car speed: " + speed);
//     }

//     public void displaySuperSpeed(){
//         super.displaySpeed();
//     }
// }

//constructor example

// class Animal {
//     private final String name;

//     public Animal(String name){
//         this.name = name;
//     }

//     public String getName(){
//         return name;
//     }

    
// }

// class Dog extends Animal {
//     private final int age;

//     public Dog(String name){
//         this(name,1); // constructor chaining - calls the matching 
//                            //     overloaded contructer.
//     }

//     public Dog(String name, int age){
//         super(name); // let animal constructer initialse name field.
//         this.age = age;
//     }

//     @Override 
//     public String toString(){
//         return "Dog{name = " + getName() + ", age =" + age + "}";
//     }
// }

// class Animal {
//     public void speak(){
//         System.out.println("Animal is speaking");
//     }
// }

// class Dog extends Animal {
//     @Override 
//     public void speak(){
//         System.out.println("dog speaks");
//     }

//     public void wags(){
//         System.out.println("dog wags tail");
//     }
// }

// class Cat extends Animal{
//     @Override 
//     public void speak(){
//         System.out.println("cat speaks");
//     }
// }

// class Animal {
// }

// class Dog extends Animal {
//     public void wags(){
//         System.out.println("dog wags tail");
//     }
// }

