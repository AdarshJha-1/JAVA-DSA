import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
//        String name = name();
//        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String greet = greet(name1);
        System.out.println(greet);
    }

    static String name(){
        return "Hello || Adarsh Jha";
    }
    static String greet(String name){
        return "Hello "+ name;
    }
}
