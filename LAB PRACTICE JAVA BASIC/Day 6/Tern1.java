import java.util.*;
class Tern1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
//System.out.println("enter two numbers to be compared");
//int n1=sc.nextInt();
//int n2=sc.nextInt();
//int max=(n1>n2?n1:n2);
//System.out.println("max num= "+max);
//System.out.println("enter a numbers ");
//int i=sc.nextInt();
//String s=(i%2==0)?"Even":"Odd";
//System.out.println("entered number is "+s);
System.out.println("enter two numbers ");
int n1=sc.nextInt();
int n2=sc.nextInt();
int diff=(n1>n2)?n1-n2:n2-n1;
System.out.println("difference between two numbers is= "+diff);



}
}