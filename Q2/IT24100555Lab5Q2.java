import java.util.Scanner;
 
 public class IT24100555Lab5Q2 {
   public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   int new_members;
   
   System.out.print("Enter the number of new members introduced: ");
   new_members= input.nextInt();
   if (new_members<0) {
     System.out.print("Input must be a number 0 or greater");
	 }
	   else {
	   String prize;
	    switch(new_members){
		  case 0:
		    prize="No prize";
		    break;
		  case 1:
		   prize="Pen";
		   break;
		  case 2:
		   prize="Umbrella";
		   break;
		  case 3:
		   prize="Bag";
		   break;
		  case 4:
		   prize="Travelling Chair";
		   break;
		  default:
		   prize="Headphone";
		   break;
		  }
		 if (new_members==0){
			 System.out.println( prize);
		 }
		  else {
		 System.out.println("The prize is :"+ prize);
		  }
		 }
		}
	}