package week2.day1;

public class Mobile {
	
	public void makeCall()
	{
		String mobileModel="Redmi";
		float mobileWeight=12f;
		System.out.println("Mobile model is "+mobileModel+"\n"+"Mobile weight is "+mobileWeight);
	}
	
	public void sendMsg()
	{
		boolean isFullCharged= true;
		int mobileCost=15000;
		
		System.out.println(isFullCharged+"\n"+"mobile cost is "+mobileCost);
	}

	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
		
		
	}
}
