public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);

//        int temp = a;
//        a = b;
//        b= temp;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Adarsh Jha";
        System.out.println(name);
        changeName(name);
        System.out.println(name);

    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b= temp;
    }

    static void changeName(String name){
        name = "Adarsh";
    }
}
