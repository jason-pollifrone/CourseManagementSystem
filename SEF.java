import java.util.Scanner;

public class SEF {
	public static final course[] cos = new course[100];
	public static final student[] stu = new student[100];
	public static final lecturer[] lec = new lecturer[100];
	public static int cosCount = 0;
	public static int stuCount = 0;
	public static int lecCount = 0;
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
	         System.out.println("C   -   View results");
	         System.out.println("D   -   View Courses");
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
	        	 case'D':
	        		 viewCourse();
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
		         System.out.println("C   -   View Class");
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
		        		 viewStuResults();
		        		 break;
		        	 case'C':
		        		 viewStuCourses();
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
		         System.out.println("B   -   View results");
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
		        	 case'B':
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
		         System.out.println("A   -   Create Course");
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
		        		 createCourse();
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
		int preReq = sc.nextInt();


		cos[cosCount] = new course(courseID, name, subject, preReq);
		cosCount++;

	}

	public static void viewCourse()
	{
		for(int i = 0; i< cosCount; i++)
		{
			cos[i].printDetails();
			System.out.println(cos[i].getCourseName());
		}
		if(cosCount == 0)
		{
			System.out.println("There are no courses in the system");
		}
	}
	public static void assignLecturer()
	{
		course list = null;
		System.out.printf("please enter course ID: ");
		String ID = sc.nextLine();
		for (int i = 0; i <cosCount; i++)
		{
			if (cos[i].getCourseID().equals(ID))
			{
				list = (course)cos[i];
			}
		}
		if (list == null)
		{
			System.out.println("input was invalid");
		}
		else if (list instanceof course != true)
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
	public static void viewStuResults()
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
		System.out.println("Enter your student ID: ");
		String id = sc.nextLine();
		for(int i = 0; i < stuCount; i++)
		{
			if(id.equals(stu[i].getID()))
			{
				System.out.println("Enter course ID: ");
				String cID = sc.nextLine();
				for(int c = 0; c < cosCount; c++)
				{
					if(cID.equals(cos[c].getCourseID()))
					{
						cID.equals(stu[i].getCourse());
					}
				}
			}
		}
	}
	public static void viewStuResult()
	{
		System.out.println("Enter student ID: ");
		String id = sc.nextLine();
		for(int i = 0; i < stuCount; i++)
		{
			if(id.equals(stu[i].getID()))
			{
				System.out.println(stu[i].getResult());
			}
		}
	}
	public static void viewResults()
	{
	 	  for(int i = 0; i < stuCount; i++)
	 	  {
			  stu[i].printDetails();
	 	  }		
	}
	public static void viewStuCourses()
	{
		System.out.println("Enter student ID: ");
		String id = sc.nextLine();
		for(int i = 0; i < stuCount; i++)
		{
			if(id.equals(stu[i].getID()))
			{
				System.out.println(stu[i].getCourse());
			}
		}
	}
	public static void viewClasses()
	{
		for(int i = 0; i <cosCount; i++)
		{
			System.out.println(cos[i].getCourseName());
		}
	}
	public static void uploadResult()
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