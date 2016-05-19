
public class specialStudent extends student 
{
	private String extraCourse;
	
	public specialStudent(String stuID, String stuName, String stuCourse, String exCourse, int stuCredit)
	{
	super(stuID, stuName, stuCourse,stuCredit);
	
	this.extraCourse = exCourse;
	}
	public String getXCourse()
	{
		return extraCourse;
	}
	public boolean confirmXtra(String extraCourse)
	{
		boolean conX = false;
		if (conX != false)
		{
			conX = true;
		}
		return confirmXtra(extraCourse);
	}
	
}
