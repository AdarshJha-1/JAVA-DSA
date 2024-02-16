public class PassingEx {
    public static void main(String[] args) {
        String name = "Adarsh Jha";
        greet(name); // pass by value
    }

    // In JAVA there is no pass by reference
    // primitives: int, short, char, byte --> just passing value
    // Object & stuff --> passing value of the reference variable

    static void greet(String naam){
        naam = "Adarsh";
        System.out.println(naam);
    }
}
