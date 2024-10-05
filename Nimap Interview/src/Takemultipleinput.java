import java.util.Scanner;

public class Takemultipleinput  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();
        
        int[] numbers = new int[count];
        
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println("You entered:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

	
