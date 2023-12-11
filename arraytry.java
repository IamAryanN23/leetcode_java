import java.util.Scanner;

public class arraytry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = new char[5];


        System.out.println("Enter a string of 5 characters:");
        String userInput = scanner.nextLine();



        userInput.getChars(0, Math.min(userInput.length(), charArray.length), charArray, 0);

        // Display the entered string as an array of characters
        System.out.print("Entered characters: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

        // Prompt the user to enter an index
        System.out.println("\nEnter an index (0-4) to print the corresponding character:");

        // Read the index from the user
        int index = scanner.nextInt();


            System.out.println("Character at index " + index + ": " + charArray[index]);


        scanner.close();
    }
}
