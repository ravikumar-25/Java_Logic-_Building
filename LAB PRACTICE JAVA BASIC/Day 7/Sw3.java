import java.util.Scanner;
class sw3{
public static void main(String args[]){
Scanner sw=new Scanner(System.in);
System.out.println("enter first letter of month in a year");
  char m=sw.next().charAt(0);
//String s;
switch(m){
case 'k':
      System.out.println("month is january.");
	  break;
case 'f':
	 System.out.println("Today is febuary.");
	 break;
case 'm':
     System.out.println("Today is march.");
case 'a':
	 System.out.println("Today is april.");
	 break;
 case 'i':
	 System.out.println("Today is may.");
	 break;
 case 'j':
	 System.out.println("Today is june.");
	 break;
case 'h':
	 System.out.println("Today is july.");
	 break;
default:
     System.out.println("invalid year.")	;
     	 
	 }
    // System.out.println("Day is "+s);








}
}