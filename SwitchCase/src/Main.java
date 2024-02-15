import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

//        if(Objects.equals(fruit, "mango")){
//            System.out.println(fruit + " is king is fruits.");
//        }
//        if(Objects.equals(fruit, "apple")){
//            System.out.println(fruit + " is sweet red fruits.");
//        }
        /*
            switch(expression){
            case one:
                // do something
                break;
            case two:
                // do something
                break;
             case three:
                // do something
                break;
             default:
                //do something
            }
         */

        switch (fruit) {
            case "Mango" -> System.out.println("King of the fruits");
            case "Apple" -> System.out.println("Sweet and red fruit");
            case "Orange" -> System.out.println("Tangy and sweet fruit");
            default -> System.out.println("Enter a valid fruit next time");
        }

        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid day number next time");
        }

        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }
    }
}
