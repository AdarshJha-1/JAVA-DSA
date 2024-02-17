public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 3, 45}, // --> 49
                {3, 25, 41}, // --> 69
                {34, 5, 4} // --> 43
        };

        int max = maxWealth(accounts);
        System.out.println(max);
    }

    static int maxWealth(int[][] accounts){
        int maxWealth = 0;
        for (int person = 0; person < accounts.length; person++) {
            int totalWealth = 0;
            for (int bank = 0; bank < accounts[person].length; bank++) {
                totalWealth += accounts[person][bank];
            }
            if(totalWealth > maxWealth){
                maxWealth = totalWealth;
            }
        }
        return maxWealth;
    }
}
