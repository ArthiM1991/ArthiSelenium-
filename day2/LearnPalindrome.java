package week2.day2;

public class LearnPalindrome {

	public static void main(String[] args) {
		
	
	int input=123;
	int output=0;
	
	for (int i = 121; i>0;) {
		
     int rem=i%10;
     output=output*10+rem;
		i/=10;
		
		
	}
	if(input==output)
	{
		System.out.println("The number is palindrome");
	}
	else
		System.out.println("The number is not palindrome");
	
	}
}
