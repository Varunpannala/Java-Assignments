package java_day2;

public class Room {
	 private int roomNo;
	  private String roomType;
	  private int roomSize;
	  private boolean acMachine;
	  
	  public  void setData(int roomNo,String roomType,int roomSize,boolean acMachine)
	  {
		  this.roomNo=roomNo;
		  this.roomType=roomType;
		  this.roomSize=roomSize;
		  this.acMachine=acMachine;
	  }
	  public void display()
	  {
		  System.out.println("roomNo is "+roomNo);
		  System.out.println("roomType is "+roomType);
		  System.out.println("roomSize is "+roomSize);
		  System.out.println("acMachine availability "+acMachine);
		  
	  }
	
	
}
