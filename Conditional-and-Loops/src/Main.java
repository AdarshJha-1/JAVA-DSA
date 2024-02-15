public class Main {
    public static void main(String[] args) {
        /*
            if (boolean expression) {
                // body --> if TRUE run this code
            } else{
                // --> else run this code
            }
        */

        int salary = 234000;

//        if(salary > 10000){
//            salary = salary + 2000;
//        }else {
//            salary = salary + 1000;
//        }

        if(salary > 100000){
            salary += 10000;
        }else if (salary < 100000 && salary > 50000){
            salary += 5000;
        }else {
            salary += 2000;
        }
            System.out.println(salary);
    }

}