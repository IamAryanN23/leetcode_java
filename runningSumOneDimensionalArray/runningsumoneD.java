public class runningsumoneD {
    public static int[] runningSum(int[] nums) {
        int [] newnum = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length;i++)
        {
                sum = sum + nums[i];
                newnum[i] =  sum;
        }
        return newnum;
    }

    
    
    
    public static void main(String[] args) {
        int[] sendnum = {1,2,3,4};
        int[] printnum = runningSum(sendnum);
        for (int a : printnum)
        System.out.println(a);
    }
}
