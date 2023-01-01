import java .util.*;
enum Week{
	     monday,
         tuesday,
		 wednesday,
		 thursday,
		 friday,
		 saturday,
		 sunday;
		 }
 class EnumSwitch{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter days name of a week");
 String Days=sc.next();
 Week x=(Week.valueOf(Days.toLowerCase()));
 switch(x){
    case monday:
	 System.out.println("today is monday");
	  break;
    case tuesday:
	System.out.println("today is tuesday");
	  break;
	case wednesday:
	  System.out.println("today is wednesday");
	  break;
	case thursday:
	System.out.println("today is thursday");
	  break; 
    case friday:
    System.out.println("today is saturday");
	  break;	
    case sunday:
	System.out.println("today is sunday");
	  break;
	default:
	System.out.println("invalid day");
	  
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 }
 }