import java.util.Scanner;

public class SEF {
	private static final Course[] cos = new Course[100];
	private static final students[] stus = new students[100];
	private static final student[] stu = new student[100];
	private static int cosCount = 0;
	private static int stusCount = 0;
	private static int stuCount = 0;
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		String user;
		String password;
		System.out.println("enter username: ");
		user = sc.nextLine();
		System.out.println("enter password: ");
		password = sc.nextLine();
		if (user.equals("admin") && (password.equals("password")))
		{
			
		String response;
	      char selection = '\0';

	      do
	      {
	         System.out.println("*** Welcome ADMIN ***");
	         System.out.println();
	         System.out.println("A   -   Create Course");
	         System.out.println("B   -   Assign Lecturer");
	         System.out.println("D   -   View results");
	         System.out.println("X   -   Exit");
	         System.out.println();
	         System.out.print("Enter your selection: ");

	         response = sc.nextLine().toUpperCase();
	         System.out.println();
	         if (response.length() != 1)
	         {
	        	 System.out.println("Error: Invalid Input - Selection must be a single character");
	         }
	         else
	         {
	        	 selection = response.charAt(0);
	        	 switch(selection)
	        	 {
	        	 case'A':
	        		 createCourse();
	        		 break;
	        	 case'B':
	        		 assignLecturer();
	        		 break;
	        	 case'C':
	        		 viewResults();
	        		 break;
	        	 case 'X':
	        		 System.out.println("Goodbye!");
	        		 break;

	        	 default:
	        		 System.out.println("Error - you did not enter a valid menu option!");

	        	 }
	         }
	         System.out.println();
	      }
	      while (selection != 'X');
	}
		else if(user.equals("student") &&(password.equals("password")))
		{
			String response;
		      char selection = '\0';

		      do
		      {
		         System.out.println("*** Welcome Student ***");
		         System.out.println();
		         System.out.println("A   -   Enrol Course");
		         System.out.println("B   -   View Results");
		         System.out.println("D   -   View Class");
		         System.out.println("X   -   Exit");
		         System.out.println();
		         System.out.print("Enter your selection: ");

		         response = sc.nextLine().toUpperCase();
		         System.out.println();
		         if (response.length() != 1)
		         {
		        	 System.out.println("Error: Invalid Input - Selection must be a single character");
		         }
		         else
		         {
		        	 selection = response.charAt(0);
		        	 switch(selection)
		        	 {
		        	 case'A':
		        		 enroll();
		        		 break;
		        	 case'B':
		        		 assignLecturer();
		        		 break;
		        	 case'C':
		        		 viewResults();
		        		 break;
		        	 case 'X':
		        		 System.out.println("Goodbye!");
		        		 break;

		        	 default:
		        		 System.out.println("Error - you did not enter a valid menu option!");

		        	 }
		         }
		         System.out.println();
		      }
		      while (selection != 'X');			
		}
		else if(user.equals("lecturer") && (password.equals("password")))
		{
			String response;
		      char selection = '\0';

		      do
		      {
		         System.out.println("*** Welcome Lecturer ***");
		         System.out.println();
		         System.out.println("A   -   Upload results");
		         System.out.println("D   -   View results");
		         System.out.println("X   -   Exit");
		         System.out.println();
		         System.out.print("Enter your selection: ");

		         response = sc.nextLine().toUpperCase();
		         System.out.println();
		         if (response.length() != 1)
		         {
		        	 System.out.println("Error: Invalid Input - Selection must be a single character");
		         }
		         else
		         {
		        	 selection = response.charAt(0);
		        	 switch(selection)
		        	 {
		        	 case'A':
		        		 uploadResult();
		        		 break;
		        	 case'C':
		        		 viewResults();
		        		 break;
		        	 case 'X':
		        		 System.out.println("Goodbye!");
		        		 break;

		        	 default:
		        		 System.out.println("Error - you did not enter a valid menu option!");

		        	 }
		         }
		         System.out.println();
		      }
		      while (selection != 'X');
		}
		else if(user.equals("pCoordinator") && (password.equals("password")))
		{
			String response;
		      char selection = '\0';

		      do
		      {
		         System.out.println("*** Welcome Program Coordinator ***");
		         System.out.println();
		         System.out.println("A   -   Add Course");
		         System.out.println("B   -   Grant Permission");
		         System.out.println("D   -   Grant Special Exemption");
		         System.out.println("X   -   Exit");
		         System.out.println();
		         System.out.print("Enter your selection: ");

		         response = sc.nextLine().toUpperCase();
		         System.out.println();
		         if (response.length() != 1)
		         {
		        	 System.out.println("Error: Invalid Input - Selection must be a single character");
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
		        		 grantPermission();
		        		 break;
		        	 case'C':
		        		 grantSExempt();
		        		 break;
		        	 case 'X':
		        		 System.out.println("Goodbye!");
		        		 break;

		        	 default:
		        		 System.out.println("Error - you did not enter a valid menu option!");

		        	 }
		         }
		         System.out.println();
		      }
		      while (selection != 'X');			
		}
	else
	{
		System.out.print("wrong username and password!");
	}
		
	}
	private static void createCourse()
	{
		System.out.println("Enter Course ID");
		String courseID = sc.nextLine();
		System.out.println("Enter Course Name");
		String name = sc.nextLine();
		System.out.println("Enter Course Subject");
		String subject = sc.nextLine();
		System.out.println("Enter Course Requirements");
		String preReq = sc.nextLine();


		cos[cosCount] = new Course(courseID, name, subject, preReq);
		cosCount++;

	}

	public static void viewCourse()
	{
		for(int i = 0; i< cosCount; i++)
		{
			cos[i].printDetails();
		}
		if(cosCount == 0)
		{
			System.out.println("There are no courses in the system");
		}
	}
	public static void assignLecturer()
	{
		lecCourse list = null;
		System.out.printf("please enter course ID: ");
		String courseID = sc.nextLine();
		for (int i = 0; i <cosCount; i++)
		{
			if(courseID.equals(cos[i].getCourseID()))
			{
				list = (lecCourse)cos[i];
			}
		}
		if (list == null)
		{
			System.out.println("input was invalid");
		}
		else if (list instanceof lecCourse != true)
		{
			System.out.println("course does not record lecturer");
		}
		else
		{
			System.out.printf("enter lecturer's name: ");
			String lecturer = sc.nextLine();
			
			if(((lecCourse)list).confirmLec(lecturer))
			{
				
			}
		}
	}
	public static void viewResults()
	{
		System.out.println("Enter Student ID: ");
		String courseID = sc.nextLine();
		for(int i = 0; i < stuCount; i++)
		{
			if(courseID.equals(stu[i].getID()))
			{
				stu[i].printDetails();
			}
			else
			{
				System.out.println ("student has no results");
			}
		}
	}
	public static void enroll()
	{
		
	}
	public static void viewResult()
	{
		
	}
	public static void viewClasses()
	{
		
	}
	public static void uploadResult()
	{
		
	}
	public static void addCourse()
	{
		
	}
	public static void grantPermission()
	{
		specialStudent list = null;
		String extraCourse = null;
		System.out.println("enter Student ID: ");
		String ID = sc.nextLine();
		for(int i = 0; i < stuCount; i++)
		{
			if(ID.equals(stu[i].getID()))
			{
				list = (specialStudent)stu[i];
			}
			 	if(((specialStudent)list).confirmXtra(extraCourse))
			 	{
			 		System.out.println("exemption has been granted!");
			 	}
		}		
	}
	public static void grantSExempt()
	{
 	}
}