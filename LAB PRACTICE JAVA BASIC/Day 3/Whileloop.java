class Whileloop{
public static void main(String args[]){
    int i=5;
	int sum =1;
    do
	{
	i=i+10;
	System.out.println(i++);
	System.out.println(i);
	System.out.println("-------------");
	System.out.println(++i);
	System.out.println(i);
	sum+=i;
	System.out.println("sum= "+sum);
	
	
	
	
	}

     while(i<20);



}





}