
public class studentResults extends student 
{
	private int results;
	public studentResults(String stuID, String stuName, String stuCourse, int stuCredit, int stuResults)
	{
		super(stuID, stuName, stuCourse, stuCredit, stuResults);
		
		this.results = stuResults;	
	}
	public int getResults()
	{
		return results;
	}
	public boolean vResults(int results)
	{
		boolean viewRes = false;
		return  vResults(results);
	}
	public void resultPrint()
	{
		super.printDetails();
		System.out.print(results);
		System.out.print("**************************");
	}
}
