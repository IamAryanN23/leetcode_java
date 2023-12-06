public class greatestCommonDivisorOfStrings 
{

    public static String gcdOfStrings(String str1, String str2) 
    {
        // Check if concatenated strings are equal or not, if not return ""
        if (!(str1 + str2).equals(str2 + str1))
        return "";
        // If strings are equal than return the substring from 0 to gcd of size(str1), size(str2)
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
        
    private static int gcd(int a, int b) 
    {
            while (b != 0) 
            {
                int temp = b;
                b = a % b;
                a = temp;
            }
        return a;
    }
        

    public static void main(String[] args) 
    {
        String s1 = "", s2="CODE";
        System.out.println(gcdOfStrings(s1,s2));
    }
}