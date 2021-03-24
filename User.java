import java.util.Scanner;

public class User {
	private String name;
	private String contact;
	private String gender;
	private int cost;
	private String keyNo;
	private String roomType;
	private String roomCode;
	private static int amount_luxury = 4500;
	private static int amount_deluxe = 3000;
	private static int x = (int) (Math.random()*200);
		
	//constructor: To initialise variables.
	
	public User(){
		this.name = "";
		this.contact = "";
		this.gender = "";
		this.cost = 0;
		this.keyNo = "";
		this.roomType = "";
		this.roomCode = "";
	}
	
	// Details: Name, Contact number, Gender, Type of room(L/D), Display info. 
	//Total Capacity is 200.
    

	public void Details() {
		Scanner in = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Enter your name: ");
		this.name = in.next();
		System.out.println("Contact number: ");
		this.contact = in.next();
		System.out.println("Gender: ");
		this.gender = in.next();
		System.out.println("Type of room (Luxury/ Deluxe): ");
		this.roomType = in.next();
		setKeyNo();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("Room Number "+(201-x)+" Booked with Room Key No: "+keyNo+" by "+name+".");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
	
	//Generate key number
	private void setKeyNo(){
		// Key no. = room code + (200-x+1)
		int num = 201-x;
		this.roomCode = roomType.equals("Luxury") ? "L" : "D";
		this.keyNo = roomCode + "" + num;
	}
	
	//Food: Menu + Price + Quantity 
	
	public void Food(){
		Scanner in = new Scanner(System.in);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Menu");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1 - Sandwich	Rs.60\n2 - Pasta	Rs.80\n3 - Noodles     Rs.100\n4 - Tea         Rs.20");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int fc = in.nextInt();
		System.out.println("Quantity: ");
		int quantity = in.nextInt();
		System.out.println("*************************************");
		if (fc==1) this.cost=60;
		else if (fc==2) this.cost=80;
		else if (fc==3) this.cost=100;
		else if (fc==4) this.cost=20;
		else System.out.println("Invalid input");
		System.out.println("Your Bill: \nRs. "+cost*quantity);
		System.out.println("*************************************");
	}				
	
	//Availabilty (Y/S)
	
	public void Availability(){
		System.out.println("*************************************");
		System.out.println("Number of rooms available: "+x);
		System.out.println("*************************************");
	}					
	
	//Checkout: Roomno + Option + Bill
	
	public void Checkout(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your Room Number: ");
		int rn = in.nextInt();		
		if (rn == (201-x)){
			System.out.println("Room number "+ rn +" is taken by "+name+"\n-------------------------------------\nDo you want to continue?(y/n)");
			System.out.println("-------------------------------------");
			String option = in.next();
			if (option.equals("y") || option.equals("Y")){
				System.out.println("=====================================");
				System.out.println("BILL: ");
				if (roomCode.equals("L")) System.out.println("Room charge - Rs. "+amount_luxury);
				else System.out.println("Room charge - Rs. "+amount_deluxe);
				System.out.println("=====================================");
			}
			else if(option.equals("n") || option.equals("N")){
				System.out.println("Operation terminated!");
			}
			else {
				System.out.println("Invalid Option");
			}
		}
		else {
			System.out.println("Room Already Empty");
		}
	}		
	
}
