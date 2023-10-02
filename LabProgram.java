import java.util.Scanner; 

public class LabProgram {

   /* Define your method here */

   public static void main(String[] args) {
      /* Type your code here. */
	   Scanner scan = new Scanner (System.in);
	   int userYear;
	   int days;
	   userYear = scan.nextInt();
	   
	   System.out.println(userYear + " has " + daysInFeb(userYear) + " days in February.");
	   
   }
   public static int daysInFeb(int userYear)
   {
	  
	   if ((userYear % 4 == 0 && userYear % 100 != 0) || (userYear % 400 == 0)) //validates the userYear is a leap userYear
		{
		   
			return 29;
			
			
		}
		else // for when it is not a leap userYear
			
	   		return 28;
			
	   
			
   }
   
   
   
}
