public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {23, 412, -44, 6, -56};
        System.out.println(evenDigitCount2(arr));
    }

    static int evenDigitCount(int[] arr){
        int evenDigCount = 0;
        for(int num : arr){
            int count = 0;
            while(num != 0){
                num /= 10;
                count++;
            }
            if(count%2 == 0){
                evenDigCount++;
            }
        }
        return evenDigCount;
    }

    static int evenDigitCount1(int[] arr){
        int evenDigCount = 0;
        for(int num : arr){
           if(String.valueOf(num).length()%2 == 0) evenDigCount++;
        }
        return evenDigCount;
    }

    static int evenDigitCount2(int[] arr){
        int evenDigCount = 0;
        for(int num : arr){
            if(num < 0){
                num *= -1;
            }
            if(((int)Math.log10(num) + 1) % 2 == 0) evenDigCount++;
        }
        return evenDigCount;
    }
}
