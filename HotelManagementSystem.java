import java.util.Scanner;

public class HotelManagementSystem {
	public static void main(String[] args) {

		System.out.println("*****************************************************");
		System.out.println("*                      WELCOME!!                    *");
		System.out.println("*  PROJECT BY AFTAAB(18BEC004) & JIVANSU(18BEC044)  *");
		System.out.println("*****************************************************");
		User usr1 = new User();
		Outer: do{
			Scanner in = new Scanner(System.in);			
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("Enter your choice: ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("1 - Book a room\n2 - Order food\n3 - Display room availability\n4 - Checkout\n5 - Exit");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			int choice = in.nextInt();
			//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");

			switch (choice){
				case 1:
					usr1.Details();
					break;

				case 2:
					usr1.Food();
					break;

				case 3:
					usr1.Availability();
					break;

				case 4:
					usr1.Checkout();
					break;

				case 5:
					break Outer;
					
				default:
					System.out.println("Invalid Input");
			}
		} while(1 != 0);
	}
}
