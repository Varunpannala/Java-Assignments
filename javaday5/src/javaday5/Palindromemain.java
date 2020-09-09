package javaday5;
import java.util.Scanner;

public class Palindromemain {

  public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int number=scanner.nextInt();
	    System.out.println("Enter 1) to reverse the number");
		System.out.println("Enter 2) to know the number is palindrome or not");
		int choice=scanner.nextInt();
		if(choice==1)
		{
		System.out.println(Palindrome.reverse(number));
		}
		else if(choice==2)
		{
		if(Palindrome.isPalindrome(number))
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
		}
		}
		else
		{
			System.out.println("Bad choice");
		}
		}

	}

