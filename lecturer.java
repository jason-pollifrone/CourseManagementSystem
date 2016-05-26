
public class lecturer extends SEF
{
	private String name;
	private String ID;
	private String course = null;
	
	public lecturer(String lecID, String lecName, String lecCourse)
	{
		this.ID = lecID;
		this.name = lecName;
		this.course = lecCourse;
	}
	public String getID()
	{
		return ID;
	}
	public String getName()
	{
		return name;
	}
	public String getCourse()
	{
		return course;
	}
	{
	lec[lecCount] = new lecturer("l1", "mr1", null); 
	lecCount++;
	lec[lecCount] = new lecturer("l2", "mr2", null); 
	lecCount++;
	lec[lecCount] = new lecturer("l3", "mr3", null); 
	lecCount++;
	}
}
