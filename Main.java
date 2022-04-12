import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("1- sms");
		System.out.println("2- Email");
		System.out.println("0- Exit");
		int option;
		//scanner.close();
		do {
			System.out.println("--------------------------");
			System.out.println("Enter the option: ");
			option  = scanner.nextInt();
			switch (option) {
			case 1:
				// SMS
				System.out.println("Enter moblie number and message : ");
				String dummy= scanner.nextLine();
				Sms<String, String> generic1 = new Sms<>(scanner.nextLine(), scanner.nextLine());
				System.out.println("Phone Number: " + generic1.getA());
				System.out.println("SMS: " + generic1.getB());
				break;
			case 2:
				// EMAIL
				String dummy1= scanner.nextLine();
				System.out.println("Enter Email id and message : ");
				Sms<String, String> generic2 = new Sms<>(scanner.nextLine(), scanner.nextLine());
				System.out.println("Email Id: " + generic2.getA());
				System.out.println("Content of the Mail: " + generic2.getB());
				break;
			case 0:
				System.out.println("byee Exited!!!");
				break;
			default:
				System.out.println("Enter the correct option----->");
			}
		} while (option != 0);
		
		scanner.close();
	}

}
