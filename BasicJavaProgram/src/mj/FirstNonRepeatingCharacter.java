package mj;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatingChar(input);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        } 
    }

    public static char findFirstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeating = false;

            // Check if the current character repeats later in the string
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }

            // If the character does not repeat, return it
            if (!isRepeating) {
                return currentChar;
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}


/*public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatingChar(input);
        
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256]; // Array to store character counts

        // Step 1: Count the frequency of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Step 2: Find the first character with a count of 1
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}
*/
