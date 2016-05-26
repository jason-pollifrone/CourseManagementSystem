
public class specialStudent extends student 
{
	private String extraCourse;
	
	public specialStudent(String stuID, String stuName, String stuCourse, String exCourse, int stuCredit, int stuResult)
	{
	super(stuID, stuName, stuCourse,stuCredit, stuResult);
	
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
