import java.util.Scanner;
class SW1{
public static void main(String args[]){
Scanner sw=new Scanner(System.in);
System.out.println("enter a number in week day");
int day=sw.nextInt();
//String Dayname;
switch(day){
case 1:
      System.out.println("Today is monday.");
	  break;
case 2:
	 System.out.println("Today is tuesday.");
	 break;
case 3:
     System.out.println("Today is wednesday.");
case 4:
	 System.out.println("Today is thursday.");
	 break;
 case 5:
	 System.out.println("Today is friday.");
	 break;
 case 6:
	 System.out.println("Today is saturday.");
	 break;
case 7:
	 System.out.println("Today is sunday.");
	 break;
default:
     System.out.println("invalid day.")	;
     	 
	 }
    // System.out.println("Day is "+s);








}
}