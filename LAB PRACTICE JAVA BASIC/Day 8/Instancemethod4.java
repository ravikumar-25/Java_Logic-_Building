public class Instancemethod4{
 String sayHello(String s)
 {
 String str;
 str=s;
 return str;
 }
 int addition(int x,int y)
 {
int sum=x+y;
return sum;	 
}
static int calculate(int l)
{
int v=l*l*l;	
return v;	
}
public static void main(String args[]){
Instancemethod4 o1=new Instancemethod4();
Instancemethod4 o2=new Instancemethod4();
int s2=o2.addition(10,20);
System.out.println(s2);
System.out.println(o1.addition(10,20));
String s1=o1.sayHello("good morning");
System.out.println(s1);
System.out.println(calculate(5));
int x=calculate(7);
System.out.println(x);



}














}