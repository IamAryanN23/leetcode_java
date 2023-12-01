class twosum {
    
    
    public static int[] two(int[] nums, int target) 
    {
        int[] answer = new int[2];
        
        for(int i=0; i<nums.length-1; i++)
        {
            for(int j=1; j<nums.length; j++)
            {
                if (nums[i]+nums[j] == target) 
                {
                answer[0] = i;
                answer[1] = j; 
                }
            }
        }
                return answer;
    }

    




    public static void main(String[] args) 
    {
        int [] number = {3,2,3};
        int goal=6;
        int[] dummy = two(number, goal);
        System.out.println(dummy[0] + " " + dummy[1]);
    }
}

