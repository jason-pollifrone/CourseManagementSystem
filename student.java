
public class student extends SEF
	{
	public String ID;
	public String name;
	public course course;
	public int credit;
	public int result;
	public course exCourse;

	//constructor
	public student(String stuID, String stuName, int stuCredit)
	{
		this.ID = stuID;
		this.name = stuName;
		this.course = null;
		this.credit = stuCredit;
		this.result = 0;
		this.exCourse = null;
	}

	
	
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
	public course getCourse()
	{
		return course;
	}
	public int getCredit()
	{
		return credit;
	}
	public int getResult()
	{
		return result;
	}
	public course getExCourse()
	{
		return exCourse;
	}
	public void setCourse(course stuCourse)
	{
		this.course = stuCourse;
	}
	public void setExCourse(course stuExCourse)
	{
		this.exCourse = stuExCourse;
	}
	public void setResult(int stuResult)
	{
		this.result = stuResult;
	}
	public void printDetails()
	{
	System.out.println("Student ID: "+ID);
	System.out.println("Student name: "+name);
	System.out.println("Student course: "+ course);
	System.out.println("class result: " +result);
	System.out.println("************************************************");
	}
}
