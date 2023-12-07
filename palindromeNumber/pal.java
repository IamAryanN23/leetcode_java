//Palindrome Number in java
import java.util.Scanner;

public class pal {

    public static void main(String[] args) 
    {
       Scanner ob = new Scanner(System.in);
       System.out.println("Enter a number");
       int n = ob.nextInt(); 
       palindrome(n);
       ob.close();
    }


       public static void palindrome (int num)
       {
        int orignalnumber = num, sum=0;
        int dum = num;
        while (num!=0) 
        {
        dum = num%10;
        sum = sum * 10 + dum;
        num = num/10;
        }
       
        if (orignalnumber == sum) 
       {
        System.out.println("True");
       } 
       
       else 
       {
        System.out.println("False");
       }

    }
}