import java.util.Scanner;

 class Deque {
    int arr[] = new int[5];
    int front = -1;
    int rear = -1;


    void insertBeginning(int data) {

        
        if (front == 0 && rear == arr.length - 1) {
            System.out.println("Deque Overflow");
            return;
        }

        if (front == -1) {
            front = rear = 0;
        }

       
        else if (front > 0) {
            front--;
        }

        else {
            System.out.println("No space at beginning");
            return;
        }

        arr[front] = data;
    }

  
    void deleteEnd() {


        if (front == -1) {
            System.out.println("Deque Underflow");
            return;
        }

        System.out.println("Deleted Element = " + arr[rear]);

        
        if (front == rear) {
            front = rear = -1;
        }

        else {
            rear--;
        }
    }

    
    void display() {

        if (front == -1) {
            System.out.println("Deque is Empty");
            return;
        }

        System.out.print("Deque Elements: ");

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Deque dq = new Deque();

        int ch;

        do {
            System.out.println("\n1.Insert at Beginning");
            System.out.println("2.Delete at End");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter Element: ");
                    int data = sc.nextInt();
                    dq.insertBeginning(data);
                    break;

                case 2:
                    dq.deleteEnd();
                    break;

                case 3:
                    dq.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (ch != 4);
    }
}