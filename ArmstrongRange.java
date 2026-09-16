import java.util.Scanner;

public class ArmstrongRange{
public static void main(String[]args){

	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter starting number:");
	int start=sc.nextInt();
	
	System.out.print("Enter ending number:");
	int end=sc.nextInt();
	
	System.out.println("Armstrong numbers between"+ start +"and"+ end +":");
	
	for(int num = start;num<=end;num++){
	
	int temp=num;
	int digits=0;
	
	while(temp!=0){
	digits++;
	temp=temp/10;
	}
	temp=num;
	int sum=0;
	
	if(sum==num){
	System.out.println(num);
	}
	}
	sc.close();
	}
	}