package week2.day2;

import java.util.Iterator;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		
		String s1="changeme";
		char[] charArray = s1.toCharArray();
		int length = charArray.length;
		
		for (int i = 0; i < length; i++) {
			
			if(i%2!=0)
			{
		System.out.print(Character.toUpperCase(charArray[i]));
				
				}
			else
				System.out.print(charArray[i]);
			
		}
		

	}

}
