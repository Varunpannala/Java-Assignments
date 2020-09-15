package java_day2;
import java_day2.Room;
import java.util.Scanner;

public class RommMain {
 
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the roomNo");
		int roomNo=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the roomType");
		String roomType=scanner.nextLine();
		
		System.out.println("Enter the roomSize ");
		int roomSize=scanner.nextInt();
		System.out.println("Is ac in the class room");
		boolean acMachine=scanner.nextBoolean();
		Room classRoom=new Room();
		classRoom.setData(roomNo, roomType, roomSize, acMachine);
		classRoom.display();
 
	}
}