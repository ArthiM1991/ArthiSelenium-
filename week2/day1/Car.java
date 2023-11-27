package week2.day1;

public class Car {
	
	public void applyBrake()
	{
		System.out.println("Applied brake ");
	}

	public void soundHorn()
	{
		System.out.println("sound horn");
	}
	
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBrake();
		obj.soundHorn();
	}
}
