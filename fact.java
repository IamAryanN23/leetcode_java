import java.util.Scanner;

public class fact {
    static int calc;

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a;
        System.out.println("Enter a number to calculate factorial: ");
        a = ob.nextInt();
        System.out.println("Factorial of the number =  " + factorial(a));
        ob.close();
    }

    public static int factorial(int k) 
    {
        if (k == 0 || k == 1) {
            return 1; // Base case
        } else {
            return k * factorial(k - 1); // Recursive case
        }

    }

}