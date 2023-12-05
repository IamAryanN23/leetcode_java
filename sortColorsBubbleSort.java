public class sortColorsBubbleSort 
{
    public static void sortColors(int[] nums) 
    {
        int dum = 0;
        for (int i=0; i<nums.length-1;i++) 
        {
            for(int j = i+1; j<=nums.length-1; j++)
            {
                if (nums[i]>nums[j])
                {
                    dum = nums[i];
                    nums[i] = nums[j];
                    nums[j] = dum; 
                }
            }
        }
            for (int p : nums)
            System.out.println(p);
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) 
    {
        int[]  num = {2,0,2,1,1,0};
        sortColors(num);
    }
}
