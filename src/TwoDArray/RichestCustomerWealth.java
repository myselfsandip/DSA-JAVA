package TwoDArray;
//https://leetcode.com/problems/richest-customer-wealth/

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] personAccounts = {
                {2,4,5},
                {1,7,9}
        };

        System.out.println(maximumWealth(personAccounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int sum;
        int richest = Integer.MIN_VALUE;
        for(int i=0 ; i< accounts.length ; i++){
            sum=0;
            for(int j = 0 ; j< accounts[i].length ; j++){
                sum += accounts[i][j];
            }

            richest = Math.max(richest,sum);
        }

        return richest;
    }
}
