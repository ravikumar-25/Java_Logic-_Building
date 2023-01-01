import java.util.Scanner;
/*enum vowel{
	A,
	E,
	I,
	O,
	U;
}*/
 class SW5{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter any alphabet ");
 char alp=sc.next().charAt(0);
 String Status;
 //vowel x=(Week.valueOf(alp.toUpperCase()));
 switch(alp){
   case 'A':
           Status= "Entered letter is a vowel";
		   break;
	case 'E':
           Status= "Entered letter is a vowel";
		   break;
    case 'I':
           Status= "Entered letter is a vowel";
		   break;
    case 'O':
           Status= "Entered letter is a vowel";
		   break;
    case 'U':
           Status= "Entered letter is a vowel";
		   break;		   
    default:
	       Status="Entered letter is not a vowel";
		  
  }
  System.out.println("Status: "+Status);
 }
 }
  
 //'A' 'a','E','e','I','i','O','o','U','u'