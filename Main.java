import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x= 0, y = 0, choice = 0;

        while (choice != 5) {
            System.out.println("\n1 - Enter two numbers");
            System.out.println("2 - print all numbers");
            System.out.println("3 - find average");
            System.out.println("4 - find prime numbers");
            System.out.println("5 - exit");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter x: ");
                x = input.nextInt();
                System.out.print("Enter y: ");
                y = input.nextInt();
            }

            else if (choice >= 2 && choice <= 4 && x > y)  {
                System.out.println("Enter numbers with x <= y first.");
            }
            else if (choice == 2) {
                for (int i = x; i <= y; i++) 
                    System.out.print(i + " ");
                System.out.println();
            }
            else if (choice == 3) {
                double average = (x +(double)y) / 2;
                System.out.println("Average: " + average);
            }
            else if (choice == 4) {
                for (int i = x; i <= y; i++) {
                    int count = 0;
                    for (int j =1; j <= i; j++)
                        if (i % j == 0) count++;

                    if (count == 2) System.out.print(i + " ");
                }
                System.out.println();
            }
            else if (choice == 5) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("Invalid choice.");
            }
        }
        input.close();
    }
}
    



