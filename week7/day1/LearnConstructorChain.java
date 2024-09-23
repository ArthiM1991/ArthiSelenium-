package week7.day1;

public class LearnConstructorChain {

	public LearnConstructorChain(int empID)
	{
		this(1115,"Arthi");
		System.out.println("one parameter constructor");
	}
	public LearnConstructorChain(int empID,String empName)
	{
		System.out.println("Two parameter constructor");
	}
	
	public LearnConstructorChain(int empID,String empName,boolean isWorking)
	{
		this(1117);
		System.out.println("three parameter constructor");
	}
	
	public LearnConstructorChain()
	{
		
		
		this(1115,"Arthi",true);
		System.out.println("No parameter constructor");
	}
	
	public static void main(String[] args) {
		LearnConstructorChain obj=new LearnConstructorChain();
	

	}

}
