package week2.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		
		int input[]= {1,4,3,2,8,6,7};
		Arrays.sort(input);
		int length1 = input.length;
		int temp;	
		System.out.println("The missing number is");
		for (int i = 0; i <length1; i++) {
			
			temp=i+1;
			if(input[i]!=temp)
			{
				System.out.println(temp);
				break;
			}
			
		}
		
		
	}

}
