package lessons.Aintro.New;


public class App {
    public static void main( String[] args )
    {
        // int x = 10; //primitive type - stored directly on stack memory. 
        // String name = "J"; //reference type - stored on heap memory.
        //                     // ref is stored in stack.

    
        // int a = 5;
        // int b = a; // copy 

        // b = 10;

        // System.out.println(a);
        // System.out.println(b);

        // //ref - multiple refs can point at same obj

        // int[] arr = {1, 2, 3};
        // int[] ref = arr;

        // ref[0] = 100;

        // System.out.println(arr[0]);
        // System.out.println(ref[0]);

        // int i = 5;
        // int result = ++i;
        // System.out.println(i);
        // System.out.println(result);

        // int a = 5;
        // int resulta = a++;
        // System.out.println(a);
        // System.out.println(resulta);

        
        // for(int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        // casting:
        //     implicit (widening) - smaller type to bigger type.
        //         byte - short -int -long - float - double
        //     explicit (narrowing) - bigger type to smaller type.
        //         truncation - loss of data.

        // int num = 100;
        // long l = num; // implicit casting

        // double d = 10.5;
        // int num = (int) d;

        // System.out.println(num); // prints 10 - truncation

        //Parsing Strings to primitives.

        // String str = "123";
        // int num = Integer.parseInt(str);
        // System.out.println(num);

        // String doubleString = "4.5";
        // double d = Double.parseDouble(doubleString);
        // System.out.println(d);

            
        
    }   
}


/*
 - Early 90's - oak.
 - jdk - developer kit
 - jre - runtime env. 

 mvn - for complile. 
 Otherwise compile with javac. - compiles to .class files 
    and is java bytecode. 

main = entrypoint - invokes the jvm.

public: 
    - access modifier - public, private, protected, default.
    - public = accessible from anywhere. 
    - private = accessible only within the class. 
    - protected = accessible within the package and subclasses. 
    - default = accessible within the package.

static - doesnt need an object to be called.

void: desnt return a value.



naming conventions:
    - classes - PascalCase
    - methods/variable camelCase
    - snake_case optional. 

Var:
    - declare type 
    - initialise with a value.
    - primitives types.
    - reference types.     

    incrementation:
        ++ 
        pre - ++i
        post - i++ 

    casting
    parsing
*/