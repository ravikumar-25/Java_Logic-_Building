public class Instancemethod3{
 String sayHello(String s)
 {
 String str;
 str=s;
 return str;
 }
public static void main(String args[]){
Instancemethod3 o1=new Instancemethod3();
String s1=o1.sayHello("good morning");
System.out.println(s1);





}














}