package canPlaceFlowers;
public class canPlaceFlowers 
{

    public static boolean canFlowers(int[] flowerbed, int n)
    {
        int count = 0;
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0   &&  (i == 0 || flowerbed[i-1] == 0) &&  (i == flowerbed.length-1 || flowerbed[i+1] == 0)) 
            {
                flowerbed[i] = 1;
                count ++;
            }
        }
        return count == n;
    }
    public static void main(String[] args) 
    {
        int[] flower = {1,0,0,0,1};
        int n = 1;
        System.out.println(canFlowers(flower, n)); //Output: true
    }
}

