
public class Fibonacci {

	public static void main(String[] args) {
		
		int i=0,j=1,fibRange=8,temp;
		System.out.println(i+"\n"+j);
		
		for (int k = 2; k < fibRange; k++) {
			
			
		temp=i+j;
		System.out.println(temp);
		i=j;
		j=temp;
		
		//System.out.println(temp);
			
		}

	}

}
