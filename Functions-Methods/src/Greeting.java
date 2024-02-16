import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        greet();
    }


    static void greet(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello "+ name + " sir!");
    }
}
