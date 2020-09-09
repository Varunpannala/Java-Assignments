package javaday5;

import java.util.Scanner;

public class Noofwordsmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a string");

        String inputString = sc. nextLine();
    	System.out.println("No of Word in String  "+Noofwords.noOfWords(inputString));
        //Noofwords.noOfWords(inputString);
	}

}
