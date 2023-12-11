import java.util.Arrays;

public class richestCustomerWealth {
    public static void main(String[] args) 
    {
        int [][] accounts = {{1,2,3},{3,2,1}};
        int [] sumArray = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++)
        {
            int sum=0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            sumArray[i] = sum;
        }
        System.out.println(Arrays.stream(sumArray).max().getAsInt());
    }

   /* public static int maximumWealth(int[][] accounts) {
        int numrows = accounts.length;
        int numcols = accounts[0].length;

        for (int row = 0; row < numrows; row++)
        {
            for (int cols = 0; cols < numcols; cols++)
            {

            }
        }
    }*/
}
