
public class lecCourse extends course
{
	private String lecturer;
	public lecCourse(String coID, String coName, String coSubject, int coPreReq, String lecturer)
	{
		super(coID, coName, coSubject, coPreReq);
		this.lecturer = lecturer;
	}
	public String getLecturer()
	{
		return lecturer;
	}
	public boolean confirmLec(String lecturer)
	{
		boolean conLec = true;
		return confirmLec(lecturer);
	}
}

