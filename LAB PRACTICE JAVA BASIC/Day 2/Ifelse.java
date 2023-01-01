import java.util.Scanner;
class IfElse{
public static void main(String[]args){
  Scanner bh=new Scanner(System.in);
  System.out.println("Enter marks");
  int marks=bh.nextInt();
  if(marks>60)
  {
  System.out.println("First");
  }
  else
 {
  System.out.println("Check for other options");
 }
}
}