public class richestCustomerWealth {
    public static void main(String[] args) {
        
        int sum=0;
        int [][] accounts = {{1,2,3},{3,2,1}};
        int [] dum = new int[accounts[0].length];
        int numrows = accounts.length;
        int numcols = accounts[0].length;
        System.out.println("Rows = " + numrows + "  Cols = " + numcols);
        for (int col = 0; col < numcols; col++)
        {
            sum = sum + accounts[0][col];
            dum[col] = sum;

        }
        System.out.println(sum);
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
