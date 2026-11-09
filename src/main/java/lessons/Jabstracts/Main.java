package lessons.Jabstracts;

public class Main {
public static void main(String[] args) {
    

    // Abstracts
    // abstract class cant be initialised.
    // Can declare abstract (bodyless) methods
    // MAke concrete methods. 
    // abstract method need to be implemented by a sub class. 
    // improves design:
    // enforcement
    // guarentees behaviour.
    // flexibility.

    // negatives: excessive coupling. 
    //             duplication. 

    // Vehicle vehicle = new Car();

    // vehicle.drive();

    //                  abstract        interface
        // constructor;        yes             no
        // fields              yes             No
        // instansiate          no             no
        // methods             A + C           A + C 

        // Override rules:
        //     - void cant change.
        //     - refs can become more specific. 
        //     - primitives 

    // Template method

    DataProcessor processor = new CsvProcessor();

    processor.process();

}
}
abstract class DataProcessor{
    // template method 
    public final void process() {
        readData();
        transformData();
        saveData();
    }

        abstract void readData();
        abstract void transformData();

        void saveData(){
            System.out.println("data saved");
        }
}

class CsvProcessor extends DataProcessor{

    @Override
    void readData(){
        System.out.println("Read CSV");
    }

    @Override
    void transformData(){
        System.out.println("transformed CSV");
    }
    
}


// class jsonProcessor




// abstract class Vehicle{

//     abstract void drive();
//     abstract void refuel();
// }

// abstract class ElectricVehice extends Vehicle{

//     @Override 
//     void refuel(){
//         System.out.println("refueling...");
//     }
// }

// class Tesla extends ElectricVehice {
//     @Override
//     void drive(){
//         System.out.println("driving...");
//     }; 
// }

