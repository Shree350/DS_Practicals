#include <iostream>import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];
        int ch, sum = 0;
        char x;

        do {
            System.out.println("\n1. Create");
            System.out.println("2. Display");
            System.out.println("3. Sum");
            System.out.println("4. Substraction");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.print("Enter 5 elements for array a: ");
                    for(i = 0; i < 5; i++)
                        a[i] = sc.nextInt();
                    break;

                case 2:
                    System.out.print("Elements in array a are: ");
                    for(i = 0; i < 5; i++)
                        System.out.print(a[i] + " ");
                    System.out.println();
                    break;

                case 3:
                    sum = 0;
                    for(i = 0; i < 5; i++)
                        sum += a[i];
                    System.out.println("Sum = " + sum);
                    break;

                case 4:
                    System.out.print("Enter 5 elements for array b: ");
                    for(i = 0; i < 5; i++)
                        b[i] = sc.nextInt();

                    System.out.print("Subtraction (a - b) = ");
                    for(i = 0; i < 5; i++) {
                        c[i] = a[i] - b[i];
                        System.out.print(c[i] + " ");
                    }
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");
            }

            System.out.print("Continue? (y/n): ");
            x = sc.next().charAt(0);

        } while(x == 'y' || x == 'Y');

        sc.close();
    }
}


