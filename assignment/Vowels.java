package assignment;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);
			System.out.println("enter a word or a snetence to see how many vowels it contain :");//ask the user to enter a sentence
			String n = s.nextLine();
			System.out.println("your sentence is :"+n);
			System.out.println("it contain "+VowelCounter(n)+" vowels");//using the method we made 
			

			
		}
		public static int VowelCounter(String word) {
			int vowel=0 ; //counter used to count the number of vowels in the sentence 
			for (int i =0 ; i < word.length();i++) {
				if (word.charAt(i)=='a'||word.charAt(i)=='o'||word.charAt(i)=='u'||word.charAt(i)=='e'||word.charAt(i)=='i') {
					vowel++;
				}
				
			}
			return vowel;//a loop used to check each letter in the sentence and compare it with vowels if the vowel is found the counter vowel will increase by one 
		
	}

}
