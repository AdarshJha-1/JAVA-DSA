import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().trim().charAt(0);
//        System.out.println(sc.next().trim());

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Character "+ ch + " is of Upper-case");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Character "+ ch + " is of Lower-case");
        }else{
            System.out.println("Enter a Valid character");
        }


//        if(ch >= 65 && ch <= 90){
//            System.out.println("Character "+ ch + " is of Upper-case");
//        } else if (ch >= 97 && ch <= 122) {
//            System.out.println("Character "+ ch + " is of Lower-case");
//        }else{
//            System.out.println("Enter a Valid character");
//        }
    }

}
