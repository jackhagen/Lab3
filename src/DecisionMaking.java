import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter your name:");
		String userName = scnr.nextLine();
		System.out.println("Enter a number between 1 and 100:");
		int userNum = scnr.nextInt();

		while (userNum < 1 || userNum > 100) {
			System.out.println("Invalid entry! Please enter a valid number.");
			userNum = scnr.nextInt();
		}

		if (userNum % 2 != 0) {
			System.out.println(userName + ", " + userNum + " is odd.");

		} else if (userNum % 2 == 0 && userNum <= 25 && userNum >= 0) {
			System.out.println(userName + ", " + userNum + " is even and less than 25.");
		} else if (userNum % 2 == 0 && userNum >= 26 && userNum <= 60) {
			System.out.println(userName + ", " + userNum + " is even.");
		} else if (userNum % 2 == 0 && userNum > 60) {
			System.out.println(userName + ", " + userNum + " is even.");
		} else if (userNum % 2 != 0 && userNum > 60) {
			System.out.println(userName + ", " + userNum + "is odd and over 60.");
		}

		System.out.println("Goodbye!");
		scnr.close();
	}
}