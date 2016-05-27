import java.util.Scanner;

public class SEF {
	// array and scanner
	public static course[] cos = new course[100];
	public static student[] stu = new student[4];
	public static lecturer[] lec = new lecturer[100];
	public static int cosCount = 0;
	public static int stuCount = 0;
	public static int lecCount = 0;
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{	
		//array starts here for all objects
		cos[cosCount] = new course("5555","IT","sef",0);
		cosCount++;
		cos[cosCount] = new course("9876", "busniess","accounting", 6);
		cosCount++;
		stu[stuCount] = new student("12345","Jason", 5);
		stuCount++;
		stu[stuCount] = new student("12346", "Jordan",  3);
		stuCount++;
		stu[stuCount] = new student("12347", "Steven",  4);
		stuCount++;
		stu[stuCount] = new student("12348", "Shaun", 5);
		stuCount++;
		lec[lecCount] = new lecturer("l1", "mr1"); 
		lecCount++;
		lec[lecCount] = new lecturer("l2", "mr2"); 
		lecCount++;
		lec[lecCount] = new lecturer("l3", "mr3"); 
		lecCount++;
		//ends
		//user input username and password to authenticate
		System.out.println("welcome");
		for(int p = 1; p > 0 ; p++)
		{
			String user;
			System.out.println("enter username: ");
			user = sc.nextLine();
			System.out.println("enter password: ");
			String password;
			password = sc.nextLine();
		//authentication is displayed here where the correct input are required to access menu
		if (user.equals("admin") && (password.equals("password")))
		{
			//specific username will be designated to the specified menu option
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
	        	 System.out.println("");
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
		        	 System.out.println("");
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
		        		 System.out.println("");

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
		        	 System.out.println("");
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
		        		 System.out.println("");

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
		        	 System.out.println("");
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
		//in incorrect input is displayed, a error message will appear
		System.out.print("wrong username and password!");
	}
		
	}
	}
	private static void createCourse()
	{
		//admin creates the course and input the specified details
		System.out.println("Enter Course ID");
		String courseID = sc.nextLine();
		System.out.println("Enter Course Name");
		String name = sc.nextLine();
		System.out.println("Enter Course Subject");
		String subject = sc.nextLine();
		System.out.println("Enter Course Requirements");
		int preReq = sc.nextInt();
// Course will be then added into the array 
		cos[cosCount] = new course(courseID, name, subject, preReq);
		cosCount++;

	}
//function to display courses in the array
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
	// function to assign lecturer to a course
	public static void assignLecturer()
	{
		lecturer temp1 = null;
		System.out.println("lecturer ID: ");
		String id = sc.nextLine();
		
		for(int i = 0; i < lecCount; i++)
		{
			if(lec[i].getID().equals(id))
			{
				temp1 = lec[i];
			}
		}
		course temp2 = null;
		System.out.println("enter course ID: ");
		String id1 = sc.nextLine();
		for(int c = 0; c < cosCount; c++)
		{
			if(cos[c].getCourseID().equals(id1))
			{
				temp2 = cos[c];
			}
		}
		if (temp1 == null)
		{
			System.out.println("error1");
		}
		else
		{
	temp1.setCourse(temp2);
		}
	}
	//function to allow the student to view their own results
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
	// lecturer can upload results for students to display
	public static void uploadResult()
	{
		student temp1 = null;
		System.out.println("Enter Student Id: ");
		String id = sc.nextLine();
		for(int i = 0; i <stuCount; i++)
		{
			if(stu[i].getID().equals(id))
			{
				temp1 = stu[i];
			}
		}
		int temp2 = 0;
		System.out.println("Enter result: ");
		int id1 = sc.nextInt();
		for(int c = 0; c < stuCount; c++)
		{
			if(stu[c].getResult() == 0)
			{
				temp2 = id1;
			}
			else
			{
				System.out.println("incorrect course ID!");
			}
		}
		if (temp1 == null)
				{
			System.out.println("error1");
				}
		else
		{
			temp1.setResult(temp2);
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
				System.out.println(stu[i].course);
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
	public static void enroll()
	{
		student temp1 = null;
		System.out.println("Enter Student Id: ");
		String id = sc.nextLine();
		for(int i = 0; i <stuCount; i++)
		{
			if(stu[i].getID().equals(id))
			{
				temp1 = stu[i];
			}
		}
		course temp2 = null;
		System.out.println("Enter course ID: ");
		String id1 = sc.nextLine();
		for(int c = 0; c < cosCount; c++)
		{
			if(cos[c].getCourseID().equals(id1))
			{
				temp2 = cos[c];
			}
			else
			{
				System.out.println("incorrect course ID!");
			}
		}
		if (temp1.getCredit() < temp2.getPreReq())
		{
			System.out.println("not enough credit to enroll");
		}
		else
		{
			temp1.setCourse(temp2);
		}
	}
	public static void grantPermission()
	{
		student temp1 = null;
		System.out.println("Enter Student Id: ");
		String id = sc.nextLine();
		for(int i = 0; i <stuCount; i++)
		{
			if(stu[i].getID().equals(id))
			{
				temp1 = stu[i];
			}
		}
		course temp2 = null;
		System.out.println("Enter course ID: ");
		String id1 = sc.nextLine();
		for(int c = 0; c < cosCount; c++)
		{
			if(cos[c].getCourseID().equals(id1))
			{
				temp2 = cos[c];
			}
			else
			{
				System.out.println("incorrect course ID!");
			}
		}
		if (temp1.getCredit() < temp2.getPreReq())
			{
				System.out.println("Not enough credit to enroll");
			}
		else
		{
			temp1.setExCourse(temp2);
		}
	}
	public static void grantSExempt()
	{
		student temp1 = null;
		System.out.println("Enter Student Id: ");
		String id = sc.nextLine();
		for(int i = 0; i <stuCount; i++)
		{
			if(stu[i].getID().equals(id))
			{
				temp1 = stu[i];
			}
		}
		course temp2 = null;
		System.out.println("Enter course ID: ");
		String id1 = sc.nextLine();
		for(int c = 0; c < cosCount; c++)
		{
			if(cos[c].getCourseID().equals(id1))
			{
				temp2 = cos[c];
			}
			else
			{
				System.out.println("incorrect course ID!");
			}
		}
			temp1.setExCourse(temp2);
	}
}