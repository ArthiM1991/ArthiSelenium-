package week2.day1;

public class Report {

	public void studentReport()
	{
		Student obj=new Student();
		System.out.println("Roll number: "+obj.rollNo);
		System.out.println("Student name : "+obj.studentName);
		System.out.println("College name : "+obj.collegeName);
		System.out.println("Mark scored is : "+obj.markScored);
		System.out.println("CGPA is : "+obj.cgpa);
	}
	
	public static void main(String[] args) {
		
		
		
Report rep=new Report();
rep.studentReport();
	}

}
