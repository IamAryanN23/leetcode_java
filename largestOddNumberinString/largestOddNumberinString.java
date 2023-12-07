package largestOddNumberinString;

public class largestOddNumberinString {

    
    public static String largestOddNumber(String num) {
        int number = Integer.parseInt(num);
        int length = num.length()-1;
        if (number % 2 == 1) 
        {
            return num;
        }
        while (length>=0) 
        {
            int n = num.charAt(length);
            if(n%2==1)
            {
                return num.substring(0, length+1); 
            }
            length--;
        }
        return "";
    }


    public static void main(String[] args) 
    {
        String s = "35427";
        System.out.println(largestOddNumber(s));
    }
}
