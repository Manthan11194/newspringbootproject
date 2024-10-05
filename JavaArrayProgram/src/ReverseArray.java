
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {0, 8, 3, 9, 5};
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}

