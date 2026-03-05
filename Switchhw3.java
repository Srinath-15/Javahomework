import java.util.Scanner;
 class Switchhw3
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1 → Dog");
        System.out.println("2 → Cat");
        System.out.println("3 → Cow");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
			{
                System.out.println("Dog says Woof");
                break;
				}
            case 2:
			{
                System.out.println("Cat says Meow");
                break;
				}
            case 3:
			{
                System.out.println("Cow says Moo");
                break;
				}
            default:
			{
                System.out.println("Invalid choice!");
				}
        }

        
    }
}
