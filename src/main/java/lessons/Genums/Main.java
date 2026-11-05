package lessons.Genums;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        
        // Enum is a type - fixed set of instances can be built.
        // Day enum:
        // Day = type
        // Day.FRIDAY - accesses the contant defined by that type.
        // today = var to store the Day ref
        // 


        // Day today = Day.FRIDAY;
        // System.out.println("Today is " + today);

        // // == type safety!!

        // for (Day day : Day.values()){
        //     System.out.println(day);   
        // }

        // Day parsedDay = Day.valueOf("MONDAY");
        // System.out.println("parsed day is " + parsedDay);

        // switch (today) {
        //     case MONDAY -> System.out.println("start");
        //     case FRIDAY -> System.out.println("end");
        //     default -> System.out.println("other");
        // }

        // Directions direction = Directions.NORTH;

        // System.out.println(direction);
        // System.out.println(direction.name());

        // System.out.println(direction == Directions.NORTH);
        // System.out.println(direction.equals(Directions.SOUTH));
     
        // for (Directions item : Directions.values()){
        //     System.out.println(item.name() + " " + item.ordinal());
        // }


        // System.out.println(Currency.USD.format(10));
        // System.out.println(Currency.EUR.format(10.5));
        // System.out.println(Currency.GBP.format(10.556622));
    
        // Strings/string builder:
        // Strings = reference types + immutable. 

        // String text = "  hello  ";

        // System.out.println(text);
        // text.trim(); // change will be discarded.
        // System.out.println(text);

        // text = text.trim();
        // System.out.println(text);

        // text = text.toUpperCase(Locale.ROOT);
        // System.out.println(text);

        // check other methods

        // StringBuilder:
        // mutability - can edit!
        // append, insert, delete, replace, reverse, toString
        // go and look at all String Builder methods

        StringBuilder sb = new StringBuilder("hello");

        System.out.println(sb);

        sb.append(" world");
        sb.insert(5, ",");
        sb.replace(0, 5, "hi");

        String saved = sb.toString(); // returns regular immutbale string
        System.out.println(saved);

    }
}



