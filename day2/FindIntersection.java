package week2.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		Arrays.sort(a);
		Arrays.sort(b);
		int length1 = a.length;
		int length2 = b.length;
		System.out.println("The below numbers are same in both arrays");
		for (int i = 0; i < length1; i++) {
			
			for (int j =0; j < length2; j++) {
				
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
				
			}
			
		}
		

	}

}
