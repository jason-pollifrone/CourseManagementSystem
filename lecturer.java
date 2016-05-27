
public class lecturer extends SEF
{
	public String name;
	public String ID;
	public course course;

	
	public lecturer(String lecID, String lecName)
	{
		this.ID = lecID;
		this.name = lecName;
		this.course = null;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public course getCourse()
	{
		return course;
	}
	public void setCourse(course lecCourse)
	{
		this.course = lecCourse;
	}

}
