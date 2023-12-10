package week2.day2;

public class ReverseOddWordsString {

	public static void main(String[] args) {
		
		String input="I am a software tester";
		String[] split = input.split(" ");
		String output ="";
		for (int i = 0; i < split.length; i++) {
			
			if(i%2!=0)
			{
				 String rev="";  
				 char ch[]=split[i].toCharArray();  
				 for(int j=ch.length-1;j>=0;j--){  
				        rev+=ch[j];  
				    }  
				output = output + rev +" ";
			}else {
				output = output + split[i] +" ";
			}
			
			
		}	
		System.out.println(output);

	}

}
