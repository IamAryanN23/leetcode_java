package largestOddNumberinString;
public class largestOddNumberinString 
{
    public static String largestOddNumber(String num) 
    {
        int length = num.length()-1;
        if ((int)num.charAt(num.length()-1)%2==1) 
        {
            return num;
        }
        while (length>=0) 
        {
            if(num.charAt(length)%2==1)
            {
                return num.substring(0, length+1); 
            }
            length--;
        }
        return "";
    }


    public static void main(String[] args) 
    {
        String s = "7542351164447";
        System.out.println(largestOddNumber(s));
    }
}
