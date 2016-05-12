import java.util.Scanner;

public class SEF {
	private static final Course[] cos = new Course[100];
	private static int cosCount = 0;
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		String response;
	      char selection = '\0';

	      do
	      {
	         System.out.println("*** Welcome ADMIN ***");
	         System.out.println();
	         System.out.println("A   -   Add Course");
	         System.out.println("B   -   View Course");
	         System.out.println("C   -   Display searched course");
	         System.out.println("D   -   Display relevant classes");
	         System.out.println("E   -   Display results");
	         System.out.println("X   -   Exit");
	         System.out.println();
	         System.out.print("Enter your selection: ");

	         response = sc.nextLine().toUpperCase();
	         System.out.println();
	         if (response.length() != 1)
	         {
	        	 System.out.println("Error did input correct option");
	         }
	         else
	         {
	        	 selection = response.charAt(0);
	        	 switch(selection)
	        	 {
	        	 case'A':
	        		 addCourse();
	        		 break;
	        	 case'B':
	        		 displayCourse();
	        		 break;
	        	 case'C':
	        		 searchCourse();
	        		 break;
	        	 case'D':
	        		 displayResults();
	        		 break;
	        	 case 'X':
	        		 System.out.println("goodye!");
	        		 break;

	        	 default:
	        		 System.out.println("Error - you did not enter a valid menu option!");

	        	 }
	         }
	         System.out.println();
	      }
	      while (selection != 'X');
	}
	private static void addCourse()
	{
		System.out.println("Enter Course ID");
		String ID = sc.nextLine();
		System.out.println("Enter Course Name");
		String name = sc.nextLine();
		System.out.println("Enter Course Subject");
		String subject = sc.nextLine();
		System.out.println("Enter Course Requirements");
		String preReq = sc.nextLine();

		cos[cosCount] = new Course (ID, name, subject, preReq);
		cosCount++;

	}

	public static void displayCourse()
	{
		for(int i = 0; i< cosCount; i++)
		{
			cos[i].printDetails();
		}
		if(cosCount == 0)
		{
			System.out.println("There is no Course that was included");
		}
	}
	public static void searchCourse()
	{
		System.out.println("Enter Course ID: ");
		String searchID = sc.nextLine();
		for(int i = 0; i < cosCount; i++)
		{
			if(searchID.equals(cos[i].getID()))
			{
				cos[i].printDetails();
			}
		}
	}
	public static void displayResults()
	{

	}
}
