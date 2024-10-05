package mj;
import java.util.Scanner;
public class VowelsAndAlphabetsSeprate {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        StringBuilder vowels = new StringBuilder();
	        StringBuilder consonants = new StringBuilder();
	        
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isLetter(ch)) {
	                if (isVowel(ch)) {
	                    vowels.append(ch);
	                } else {
	                    consonants.append(ch);
	                }
	            }
	        }
	        
	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	        
	        scanner.close();
	    }

	    public static boolean isVowel(char ch) {
	        ch = Character.toLowerCase(ch);
	        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	    }
	}

	

