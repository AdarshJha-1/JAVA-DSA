public class FunctionOverloading {
    public static void main(String[] args) {
        greeting();
        greeting("ADARSH JHA");
    }

    static void greeting(){
        System.out.println("Hello sir!");
    }
    static void greeting(String name){
        System.out.println("Hello " + name + " sir!");
    }
}
