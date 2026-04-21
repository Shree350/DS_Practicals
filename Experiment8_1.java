import java.util.Scanner;

class node{
    int data;
    node next;

    node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Experiment8_1 {
    node top;

    void push(int data){
        node newnode = new node(data);
        newnode.next = top;
        top = newnode;
    }

    void pop(){
        if(top == null){
            System.out.println("stack is empty");
            return;  
        }
        System.out.println("Removed : " + top.data);
        top = top.next;
    }
     void peek(){
        if(top == null){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Tpo element is :" + top.data);
        }
     }

     void Display(){
        if(top == null){
            System.out.println("Stack is empty");
            return;
        }
        node temp = top;
        System.out.println("Stack element");

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Experiment8_1 s = new Experiment8_1();

        int choice;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");   // NEW
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    s.push(val);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.peek();   // NEW
                    break;

                case 4:
                    s.Display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
     }
}
