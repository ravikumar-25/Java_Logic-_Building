import java.util.Scanner;
 class Armstrong{
 public static void main (String args[]){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int check=sc.nextInt();
	//number of digit
    int count=0;
	int num=check;
	while(num!=0){
	num=num/10;
	count++;
	}
	System.out.println("Number of given number is "+count);
	//finding digits
	int find=check;
	int digit=0;
	int sum=0;
	while(find!=0){
		digit=find%10;
		find=find/10;
		int power=1;
		for(int i=0;i<count;i++){
			power=power*digit;
		}
		 sum+=power;
		 
			
        // System.out.println("our digit is "+digit);
	}
	System.out.println(sum);
 }
 
 
 
 }
 
 
 
 
 