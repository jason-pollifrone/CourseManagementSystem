public class course extends SEF {
	private String courseID;
	private String name;
	private String subject;
	private int preReq;
	//constructor
	public course(String coID, String coName, String coSubject, int coPreReq)
	{
		this.courseID = coID;
		this.name = coName;
		this.subject = coSubject;
		this.preReq = coPreReq;
	}	
	public String getCourseID()
	{
		return courseID;
	}
	public String getCourseName()
	{
		return name;
	}
	public String getSubject()
	{
		return subject;
	}
	public int getPreReq()
	{
		return preReq;
	}


	public void printDetails()
	{
	System.out.println("Course ID: "+courseID);
	System.out.println("Course name: "+name);
	System.out.println("Course Subject: " +subject);
	System.out.println("Course pre-requisite: "+preReq);
	System.out.println("************************************************");
	}
}
