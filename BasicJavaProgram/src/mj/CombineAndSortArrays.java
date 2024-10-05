package mj;

public class CombineAndSortArrays {
    public static void main(String[] args) {
        // Define the two numbers
        int no1 = 1345;
        int no2 = 566928;

        // Convert the numbers to arrays of digits
        int[] digits1 = convertToDigitsArray(no1);
        int[] digits2 = convertToDigitsArray(no2);

        // Combine the two arrays
        int[] combinedArray = new int[digits1.length + digits2.length];
        int index = 0;
        for (int digit : digits1) {
            combinedArray[index++] = digit;
        }
        for (int digit : digits2) {
            combinedArray[index++] = digit;
        }

        // Sort the combined array using simple logic (bubble sort)
        bubbleSort(combinedArray);

        // Display the sorted array
        System.out.print("Sorted combined array: ");
        for (int digit : combinedArray) {
            System.out.print(digit + " ");
        }
    }

    // Helper method to convert a number to an array of its digits
    public static int[] convertToDigitsArray(int number) {
        String numberStr = String.valueOf(number);
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digits;
    }

    // Bubble sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

