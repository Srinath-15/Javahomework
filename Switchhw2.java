
import java.util.Scanner;

class Switchhw2
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Color Menu ===");
        System.out.println("1 → Red");
        System.out.println("2 → Green");
        System.out.println("3 → Blue");
        System.out.print("Enter your choice (1-3): ");

        
            int choice = scanner.nextInt();

            switch (choice) 
			{
                case 1:
                    System.out.println("You selected: Red");
                    break;
                case 2:
                    System.out.println("You selected: Green");
                    break;
                case 3:
                    System.out.println("You selected: Blue");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        
        
    }
}
