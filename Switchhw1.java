import java.util.Scanner;
class Switchhw1
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number from 1 to 7");
  int a=sc.nextInt();
  switch (a)
  {
	  case 1:
	  {
		  System.out.println("MONDAY");
		  break;
	  } 
       case 2:
	  {
		  System.out.println("TUESDAY");
		    break;
	  } 
 case 3:
	  {
		  System.out.println("WENSDAY");
		    break;
	  } 
	   case 4:
	  {
		  System.out.println("THURSDAY");
		    break;
	  } 
 case 5:
	  {
		  System.out.println("FRIDAY");
		    break;
	  } 
  case 6:
	  {
		  System.out.println("SATURDAY");
		    break;
	  } 
 case 7:
	  {
		  System.out.println("SUNDAY");
		    break;
	  } 

	  default:
	  {
		  System.out.println("NEW DAY DISCOVERED???");
	  } 	  
  }
 }	 
}	