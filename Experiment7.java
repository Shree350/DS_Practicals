import java.util.Scanner;

class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
public class Experiment7 {

    public static node insertiotAtBigning(node head,int value){
        node newnode = new node(value); // create a new node
        newnode.next= head ;  // connect to head
        head = newnode;  // stores newnode in head
        return head;
    }

    public static node insertAtend(node head,int val){
        node newnode = new node(val);  // create a new node

        if(head == null){
            return newnode;  // check link list is empty ya no
        }

        node temp = head; // stores in new node

        while(temp.next != null){
            temp = temp.next;   // check at last trsvesal
        }
        temp.next = newnode;  // connect node
        return head;
    }

    public static node insertAtAnyPosition(node head,int value,int pos){
        node newnode = new node(value);   // new mode

        if(pos == 1){
            newnode.next = head;  // for chech node ate head position
            return newnode;
        }

        node temp = head; // store in new 

        for(int i=1; i<pos-1; i++){  // to chect in link list position
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    // Delet At frist
    public static node deleteFrist(node head ){
        if(head == null){
            System.out.println("List is Empty");
            return null;
        }
        head = head.next;
        return head;
    }

    // Delet At end
    public static node deleteEnd(node head){

        if(head == null) {
            return null;
        }
        if(head.next == null){
            return null;
        }

        node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    public static void Display(node head){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        node head = null;

        int choice,value;
        do{
            System.out.println("Enter which operation you perform on ssl");
            System.out.println("===========================================");
            System.out.println("1. Insert At Begnig");
            System.out.println("2. Insert At End");
            System.out.println("3. Insert At Any Position");
            System.out.println("4. Delet Frist");
            System.out.println("5. Delet At End");
            System.out.println("6. Display");
            System.out.println("0. Exit");
            System.out.println("============================================");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {

        case 1:
            System.out.print("Enter value: ");
            value = sc.nextInt();
            head = insertiotAtBigning(head, value);
            break;

        case 2:
            System.out.print("Enter value: ");
            value = sc.nextInt();
            head = insertAtend(head, value);
            break;

        case 3:
            System.out.print("Enter value: ");
            value = sc.nextInt();
            System.out.print("Enter position: ");
            int pos = sc.nextInt();
            head = insertAtAnyPosition(head, value, pos);
            break;

        case 4:
            head = deleteFrist(head);
            break;

        case 5:
            head = deleteEnd(head);
            break;

        case 6:
            Display(head);
            break;

        case 0:
            System.out.println("Exiting...");
            break;

        default:
            System.out.println("Invalid choice!");
    }

        } while (choice != 0);

            sc.close();
            
        
    }
    
}

