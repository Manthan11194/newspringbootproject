package mj;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        // Loop to iterate through each row
        for (int i = rows; i >= 0; i--) {
            // Loop to print stars for each row
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
