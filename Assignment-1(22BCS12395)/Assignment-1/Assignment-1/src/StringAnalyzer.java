/*write a java program to analyze a string input by the user. the program should
count the no of vowels, consonants, digits and special characters in the string.
*/

import java.util.Scanner;

public class StringAnalyzer
{
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		
		System.out.println("Enter a string:");
        String input = str.nextLine();

        input = input.toLowerCase();

        int vowelCnt = 0;
        int consonantCnt = 0;
        int digitCnt = 0;
        int specialCharCnt = 0;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCnt++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                consonantCnt++;
            }
            else if(ch >= '0' && ch <= '9'){
                digitCnt++;
            }
            else{
                specialCharCnt++;
            }
        }

        System.out.println("String Analysis:");
        System.out.println("Number of vowels: " + vowelCnt);
        System.out.println("Number of consonants: " + consonantCnt);
        System.out.println("Number of digits: " + digitCnt);
        System.out.println("Number of special characters: " + specialCharCnt);

        str.close();
	}
}
