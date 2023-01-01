import java.util.Scanner;
class Ifelse{
public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter marks ");
 int marks=sc.nextInt();
if(marks>=33){
 if(marks>=60)
 {
 System.out.println("Class=First");
   if(marks>=85)
   {
	System.out.println("Grade=A1");
   }
   else
   {
	   System.out.println("Grade=A2");
   }
 }

 else
 {
	 System.out.println("Class=second");
     if(marks>=45)
	 {
		 System.out.println("Grade=B1");
	 }
 
     else
	 {
		 System.out.println("Grade=B2");
	 }
 }	
} 
 else
 {
	 System.out.println("Fail");
 }
 }
 }