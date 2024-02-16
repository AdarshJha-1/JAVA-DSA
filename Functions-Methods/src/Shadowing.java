public class Shadowing {
    static int a = 20;
    public static void main(String[] args) {
        System.out.println(a);
        int a = 10;
        System.out.println(a);
        outside();
    }

    static void outside(){
        System.out.println(a);
    }
}
