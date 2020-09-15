package java_day2;
import java_day2.B;
	
	public class A extends B {
		   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product of the given numbers:"+z);
		   }
			
		   public static void main(String args[]) {
		      int a = 20, b = 10;
		      A  demo = new A();
		      demo.addition(a, b);
		      demo.Subtraction(a, b);
		      demo.multiplication(a, b);
		   }
		}


