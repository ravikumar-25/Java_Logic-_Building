import java.util.Scanner;
 class Sw4{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a float number");
 float F=sc.nextFloat();
 String Stat;
 switch(F){
  case 1.1:
           Stat="its fine.";
  case 1.2:		   
           Stat="its not fine.";
  default:
           Stat="everything is fine.";
 
 
 
 
 
 
 
 }
 System.out.println("status= "+Stat);





}
}