package mj;

public class StringLength {
    public static void main(String[] args) {
        String str = "Manthan";
        int length = 0;
        
        for(char c : str.toCharArray()) {
            length++;
        }
        
        System.out.println("Length of the string: " + length);
    }
}
