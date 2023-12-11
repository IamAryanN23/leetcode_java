public class hamming 
{
    public static int hammingWeight(int n) 
    {
      int count = 0;
      String bin = Integer.toBinaryString(n);
      for(char c : bin.toCharArray())
      {
        if (c=='1')
        {
            count ++;
        }
      } 
      return count; 
    } 
    
    public static void main(String[] args) 
    {
        int n = 1111111101;
        System.out.println(hammingWeight(n));
    }
}
