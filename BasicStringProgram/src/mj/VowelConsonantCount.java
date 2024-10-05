package mj;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int vowelCount = 0;
        int consonantCount = 0;
        
        str = str.toLowerCase();
        
        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
