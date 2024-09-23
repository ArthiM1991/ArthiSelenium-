package week7.day1;

public class LearnConstructor {
int empId;
String empName;
boolean isWorking;

public void empDetails()
{
	System.out.println("Emp details");
}
	//syntax for the constructor
	public LearnConstructor()
	{
		this.empDetails();
		
System.out.println("Default constructor");
	}
	public LearnConstructor(int empId)
	{
System.out.println("One Parameterized constructor");
	}
	public LearnConstructor(int empId, String empName)
	{
		this.empId=empId;
		this.empName=empName;
		this.empDetails();
System.out.println("two Parameterized constructor");
	}
	public static void main(String[] args) {
		LearnConstructor obj=new LearnConstructor();
		System.out.println(obj.empId);
		System.out.println(obj.empName);
		System.out.println(obj.isWorking);
	}

}
