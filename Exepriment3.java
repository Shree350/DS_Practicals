import java.util.Scanner;

public class exeperiment3 {

    // Linear Search
    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    //  for Binary Search (Array must be sorted)
    public static int binarySearch(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    //  for Display array
    static void display(int arr[]) {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements (Sorted for Binary Search):");
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int choice;

        do {
            System.out.println("\n1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter key: ");
                    int k1 = sc.nextInt();
                    int r1 = linearSearch(arr, k1);

                    if (r1 == -1) {
                        System.out.println("Not Found");
                    } else {
                        System.out.println("Found at index " + r1);
                    }
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    int k2 = sc.nextInt();
                    int r2 = binarySearch(arr, k2);

                    if (r2 == -1) {
                        System.out.println("Not Found");
                    } else {
                        System.out.println("Found at index " + r2);
                    }
                    break;

                case 3:
                    display(arr);
                    break;

                case 0:
                    System.out.println("Program Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
