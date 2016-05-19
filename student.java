
public class student {
	private String ID;
	private String name;
	private String course;
	private int credit;

	//constructor
	public student(String stuID, String stuName, String stuCourse, int stuCredit)
	{
		this.ID = stuID;
		this.name = stuName;
		this.course = null;
		this.credit = stuCredit;
	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public String getCourse()
	{
		return course;
	}
	public int getCredit()
	{
		return credit;
	}
	public void printDetails()
	{
	System.out.println("Student ID: "+ID);
	System.out.println("Student name: "+name);
	System.out.println("************************************************");
	}
}
