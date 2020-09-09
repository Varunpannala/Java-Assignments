package java_day1;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

	 int choice,num1,num2,result;
	 Scanner input= new Scanner(System.in);
	 System.out.println("1)"+"Addition");
	 System.out.println("2)"+"Subtract");
	 System.out.println("3)"+"Division");
	 System.out.println("4)"+"Modulo Division");
	 choice=input.nextInt();
	 num1=input.nextInt();
	 num2=input.nextInt();
		
	 switch(choice) {
	 
	 case 1:
			System.out.println("Addition");
			result=num1+num2;
			System.out.println(result);
			break;
	 case 2:
			System.out.println("Subtract");
			result=num1-num2;
			System.out.println(result);
			break;
	 case 3:
			System.out.println("Division");
			result=num1/num2;
			System.out.println(result);
			break;
	 case 4:
			System.out.println("Modulo Division");
			result=num1%num2;
			System.out.println(result);
			break;
		

			

	 }

	

}
}
