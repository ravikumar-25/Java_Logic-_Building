import java.util.Scanner;
class sw2{
public static void main(String args[]){
Scanner sw=new Scanner(System.in);
System.out.println("enter a Month in a year");
String month=sw.next();
//String Dayname;
switch(month){
case "january":
      System.out.println("month is january.");
	  break;
case "febuary":
	 System.out.println("Today is febuary.");
	 break;
case "march":
     System.out.println("Today is march.");
case "april":
	 System.out.println("Today is april.");
	 break;
 case "may":
	 System.out.println("Today is may.");
	 break;
 case "june":
	 System.out.println("Today is june.");
	 break;
case "july":
	 System.out.println("Today is july.");
	 break;
default:
     System.out.println("invalid year.")	;
     	 
	 }
    // System.out.println("Day is "+s);








}
}