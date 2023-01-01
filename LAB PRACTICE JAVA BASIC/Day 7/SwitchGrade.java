import java.util.Scanner;
 class SwitchGrade{
  public static void main(String args[]){
  System.out.println("enter marks");
  Scanner sc=new Scanner(System.in);
  int m=sc.nextInt();
  char a=((m>80?'A':(m>65&&m<=80)?'B':(m>50&&m<=65)?'C':(m>33&&m<=50)?'D':'E'));
  switch(a){
	  case 'A':System.out.println("distinction");
	  break;
	  case 'B':System.out.println("first division");
	  break;
	  case 'C':System.out.println("second division");
	  break;
	  case 'D':System.out.println("third division");
	  break;
	  case 'E':System.out.println("fail");
	  break;
	  default:
	          System.out.println("invalid entry");
	  
	  
	  
	  
	  
  }














}
}