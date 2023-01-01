import java. util.Scanner;
class Forloop{
public static void main(String args[]){
	Scanner ra=new Scanner (System.in);
System.out.println("enter two integer");
int a=ra.nextInt();
int b=ra.nextInt();
   for(int i=a,j=b;j>0;i++,j--)
   {
   System.out.println("i= "+i);
   System.out.println("j= "+j);
   System.out.println(i+" + "+j);
   System.out.println(i+j);
   System.out.println("----------");
   }
   System.out.println("assignment over");
   
   




}



}