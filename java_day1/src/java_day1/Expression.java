package java_day1;
import java.util.Scanner;
public class Expression {
	
	public static void main(String[] args) {
		int choice,num1,num2,num3,num4,num5,num6,result;
		System.out.println("1)"+"num1+num2*num3");
		System.out.println("2)"+"(num1+num2)%num3");
		System.out.println("3)"+"num1+num2*num3/num4");
		System.out.println("4)"+"num1+num2/num3*num4-num5%num6");
		Scanner input= new Scanner(System.in);
		choice=input.nextInt();
		switch(choice) {
		
		case 1:
			num1=input.nextInt();
			num2=input.nextInt();
			num3=input.nextInt();
			result=num1+num2*num3;
			System.out.println(result);
			break;
			
		case 2:
			num1=input.nextInt();
			num2=input.nextInt();
			num3=input.nextInt();
			result=(num1+num2)%num3;
			System.out.println(result);
			break;	
			
		case 3:
			num1=input.nextInt();
			num2=input.nextInt();
			num3=input.nextInt();
			num4=input.nextInt();
			result=num1+num2*num3/num4;
			System.out.println(result);
			break;		
			
		case 4:
			num1=input.nextInt();
			num2=input.nextInt();
			num3=input.nextInt();
			num4=input.nextInt();
			num5=input.nextInt();
			num6=input.nextInt();

			result=num1+num2/num3*num4-num5%num6;
			System.out.println(result);
			break;	



		}
		
		
	}

}
