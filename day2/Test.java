package week2.day2;

public class Test {

	public static void main(String[] args) {

		String test = "changeme";
		char[] arr = test.toCharArray();
		for(int i =0; i<arr.length;i++) {
			if(i%2==0)
			{
				System.out.println(Character.toUpperCase(arr[i]));
			}
			else
				System.out.println(arr[i]);

	}

}

}