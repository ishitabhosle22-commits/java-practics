import java.util.Scanner;

public class AtmManagment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int correctPin = 12345;
		int balance = 10000;
		int enterPin;
		int choice;
		int depositeMoney;
		int amount;
		int moneyWithdraw;
		System.out.println("Enter the pin= ");
		enterPin = sc.nextInt();
		if (enterPin == correctPin) {
			System.out.println("Logine successful");

		} else {
			System.out.println("Invalid pin!!Pleaase try again");
		}

		do {
			 System.out.println("-----ATM Menu-----");
				System.out.println("1.Check balance");
				System.out.println("2.Deposite Money");
				System.out.println("3.Withdraw Money");
				System.out.println("4.Exit");

				System.out.println("Enter Your Choice:");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Your balance is: "+balance);
					break;
				case 2:

					System.out.println("How Many Money U want to Deposite: ");
					depositeMoney = sc.nextInt();
					if (depositeMoney > 0) {
						balance = balance + depositeMoney;
						System.out.println("Updated balance = " + balance);
						System.out.println("Money deposite succesfuly");
					} else {
						System.out.println("Something is error");
					}
					break;
				case 3:
					System.out.println("Total many money u want to Withdraw: ");
					moneyWithdraw = sc.nextInt();
					if (moneyWithdraw > 0 && moneyWithdraw<balance) {
						moneyWithdraw = balance-moneyWithdraw;
						System.out.println("Remaining Money: " + moneyWithdraw);
					} else {
						System.out.println("Insufficant Balance");
					}
					break;
				case 4:
					System.out.println("Thank you for chossing ATM");
					break;

				default:
					System.out.println("Invalid Choice");
					break;
				}
				System.out.println("Thank you");
			} 
		
			

		 while (choice!= 4);

	}
}
