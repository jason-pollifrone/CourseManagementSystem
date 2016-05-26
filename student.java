
public class student extends SEF{
	public String ID;
	public String name;
	public String course;
	public int credit;
	public int results;

	//constructor
	public student(String stuID, String stuName, String stuCourse, int stuCredit, int stuResults)
	{
		this.ID = stuID;
		this.name = stuName;
		this.course = stuCourse;
		this.credit = stuCredit;
		this.results = stuResults;
	}
	{
		stu[stuCount] = new student("12345","Jason", "321", 5,50);
		stuCount++;
		stu[stuCount] = new student("12346", "Jordan", "321", 3,50);
		stuCount++;
		stu[stuCount] = new student("12347", "Steven", "321", 4,70);
		stuCount++;
		stu[stuCount] = new student("12348", "Shaun", "321", 5,70);
		stuCount++;
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
	public int getResult()
	{
		return results;
	}
	public void printDetails()
	{
	System.out.println("Student ID: "+ID);
	System.out.println("Student name: "+name);
	System.out.println("Student course: "+ course);
	System.out.println("class result: " +results);
	System.out.println("************************************************");
	}
}
