import java.util.Scanner;

public class Exeperiment6 {
    static int arr[];
    static int front = -1;
    static int rear = -1;
    static int size = 5;


    // operation EnQueue
    public static void EnQueue(int data){
        if(rear == size-1){
            System.out.println("The Queue is Full"); 
        return;
}
        if(front == -1){
            front = 0;
        }
        rear++;
        arr[rear] = data;
        System.out.println(data + " is Inserted"); 
    }
    

    // operation Dequeue
    public static void DeQueue(){
        if( front == -1 || front > rear){
            System.out.println("The Queue is Empty");
            return;
        }
        System.out.println(arr[front] + " is Removed");
        front++;
    }

    // for display
    public static void Display(int arr[]) {
    if (front == -1 || front > rear) {
        System.out.println("The Queue is Empty");
        return;
    }

    System.out.print(" arr = [");
    for (int i = front; i <= rear; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("]");
   
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Queue: ");
        size = sc.nextInt();

        arr = new int[size];

        int choice, data;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("========================================");
            System.out.println("1. EnQueue");
            System.out.println("2. DeQueue");
            System.out.println("3. Display");
            System.out.println("0. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter element to insert: ");
                    data = sc.nextInt();
                    EnQueue(data);
                    break;

                case 2:
                    DeQueue();
                    Display(arr);
                    break;

                case 3:
                    Display(arr);
                    break;

                case 0:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);

        sc.close();
    }
}

