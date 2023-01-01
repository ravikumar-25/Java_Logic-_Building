class Test{
 static int x=20;//static variable
 int y=30;//non static variable
void display()//non static method
{
System.out.println(x);
System.out.println(y);
show();
}
 static void show()//static method
{
System.out.println(x);

}
public static void main(String args[])
{
Test a=new Test();
a.display();
show();
//System.out.println(x);
//System.out.println(a.x);
//System.out.println(y);
//x=15;
//System.out.println(x);

}

/*static method can only call static variable
 but non static method can call both statc and non static method.*/

/*you need a reference variable to call a non static method 
but u can call directly a static method without any reference variable*/















}