import java.util.*;

public class Exp1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];

        int choice;

        do {
            System.out.println("\n\n----MENU----");
            System.out.println("1. Create A");
            System.out.println("2. Create B");
            System.out.println("3. Display A");
            System.out.println("4. Display B");
            System.out.println("5. Addition");
            System.out.println("6. Subtraction");
            System.out.println("7. Multiplication");
            System.out.println("8. Division");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter elements of A: ");
                    for (int i = 0; i < n; i++) {
                        a[i] = sc.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Enter elements of B: ");
                    for (int i = 0; i < n; i++) {
                        b[i] = sc.nextInt();
                    }
                    break;

                case 3:
                    System.out.print("Array A: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    break;

                case 4:
                    System.out.print("Array B: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(b[i] + " ");
                    }
                    break;

                case 5:
                    System.out.print("Addition: ");
                    for (int i = 0; i < n; i++) {
                        c[i] = a[i] + b[i];
                        System.out.print(c[i] + " ");
                    }
                    break;

                case 6:
                    System.out.print("Subtraction: ");
                    for (int i = 0; i < n; i++) {
                        c[i] = a[i] - b[i];
                        System.out.print(c[i] + " ");
                    }
                    break;

                case 7:
                    System.out.print("Multiplication: ");
                    for (int i = 0; i < n; i++) {
                        c[i] = a[i] * b[i];
                        System.out.print(c[i] + " ");
                    }
                    break;

                case 8:
                    System.out.print("Division: ");
                    for (int i = 0; i < n; i++) {
                        c[i] = a[i] / b[i];
                        System.out.print(c[i] + " ");
                    }
                    break;

                case 9:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

    }
}
