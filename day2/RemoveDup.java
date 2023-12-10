package week2.day2;

public class RemoveDup {

	public static void main(String[] args) {
		String input="We learn Java basics as part of java sessions in java week1";
		
		int count=0;
		String[] split = input.split(" ");
		for (int i = 0; i < split.length; i++) {
			
			for (int j = i+1; j < split.length; j++) {
				
				if(split[i].equalsIgnoreCase(split[j]))
				{
					split[j]="";
					count++;
					}
				
			}		
			
			
		}
		if (count>0)
			for (int k = 0; k < split.length; k++) {
				
				System.out.print(split[k]+" ");
				
			}
	}


	}

