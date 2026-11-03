package lessons.Cconditionals;

public class Main {
    public static void main(String[] args) {

        // if statement - runs a block of code gated behind a condition.
        // must be a boolean returned by the expression.
        // () surrounds the condition.
        // {} - surrounds the logic - evn if single line makes future edits safer.

        // int x = 10;

        // if (x > 0) {
        // System.out.println("x is positive");
        // }

        // System.out.println("This will always run");

        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to
        // == equal to
        // != not equal to

        // Else
        // supplies an alternative when the if was false.
        // exactly 1 block can run.
        // else does not have a conditional.

        // int x = -10;

        // if (x > 0) {
        // System.out.println("x is positive");
        // } else {
        // System.out.println("x is not positive");
        // }

        // System.out.println("checker");

        // else if
        // a chain that checks several possibilites.
        // read top to bottom.
        // first matching condition gets run
        // the rest gets skipped.
        // final else.
        // vs seperate if blocks - all will run if true.

        // int x = -10;

        // if (x > 0) {
        // System.out.println("x is positive");
        // } else if (x < 0) {
        // System.out.println("x is negative");
        // } else {
        // System.out.println("x is zero");
        // }

        // System.out.println("checker");

        // Nested if statements
        // only reached if surrounding branch is triggered.
        // indentation for readability.

        // int x = 10;

        // if (x > 0) {

        // if (x % 2 == 0) {
        // System.out.println("x is even and positive");
        // } else {
        // System.out.println("x is odd and positive");
        // }
        // } else {
        // System.out.println("x is not positive");
        // }

        // Ternary operator
        // condition ? valueiftrue : valueiffalse
        // produces a value.
        // value assigned to a variable.
        // keep simple and short

        // int x = 10;

        // String result = (x > 0) ? "positive" : "not positive";

        // System.out.println(result);

        // int x = 10;

        // int squareOrDouble = (x % 2 == 0)
        //         ? x * x
        //         : x * 2;

        // System.out.println(squareOrDouble);

        
    // int number = 10;

    // int result = (number % 2 == 0) 
    //         ? squareValue(number) 
    //         : doubleValue(number);
    // System.out.println(result);

    // }
    // public static int squareValue(int x){
    //     return x * x;
    // }
    // public static int doubleValue(int x){
    //     return x * 2;
    // }
  
    // int a = 10000;
    // int b = 120;
    // int c = 15;

    // String result = !(a > b) 
    //         ? (b > c 
    //             ? "b is the largest" 
    //             : "c is the largest") 
    //         : "a is the largest";

    // System.out.println(result);

    // &&(logical "and") + ||(logical "or")
    
    // int age = 10;
    // boolean hasLicense = true;

    // if (age >=17 || hasLicense){
    //     System.out.println("You can drive");
    // } else {
    //     System.out.println("You cannot drive");
    // }

    // order of precedence:
    //     - ()
    //     - !
    //     - * / %
    //     -    + -
    //     - < <= > >=
    //     - == !=
    //     - &&
    //     - ||
    //     - ? : 

    // boolean isAdmin = true;
    // boolean isVerified = true;
    // boolean onHoliday = false;
    
    // if ((isAdmin || isVerified) && !onHoliday){
    //     System.out.println("Access granted");
    // } else {
    //     System.out.println("Access denied");
    // }

    // switch:
    // - value(selector)
    // - WHen a case matches the vlaue trigger code block.
    // - default - can be used if no other matches. 
    // - good for discrete and unchanging values
    // - very similar to if else if else flow. 

    // constraints:
    // supported types: ints/bytes/chars/shorts primitives.
    // Strings
    // enums

    // int day = 1;

    // switch (day) {
    //     case 1:
    //         System.out.println("Monday");
    //         break;
    //     case 2:
    //         System.out.println("Tuesday");
    //         break;
    //     case 3:
    //         System.out.println("Wednesday");
    //         break;
    //     default:
    //         System.out.println("Not a valid day");
    //         break;
    // }

    // System.out.println("post switch check");

    // int day = 1;

    // switch (day) {
    //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
    //     case 6, 7 -> System.out.println("Weekend");
    //     default -> System.out.println("Not a valid day");
    // }

    // String grade = "B";

    // String result = switch (grade) {
    //     case "A", "B" -> {
    //         System.out.println("successful");
    //         yield "passed";
    //     }
    //     case "C" -> {
    //         System.out.println("average");
    //         yield "failed";
    //     }
    //     default -> {
    //         System.out.println("invalid grade");
    //         yield "error";
    //     }
    // };

}
}

