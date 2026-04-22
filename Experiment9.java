

import java.util.Scanner;
class node {
    int data;
    node left,right;

    node(int data){
        this.data = data;
        left = right = null;
    }
}

public class Experiment9 {
    node root;

    void inOrderDisplay(node root){
        if(root != null){
            inOrderDisplay(root.left);
            System.out.print(root.data + " ");
            inOrderDisplay(root.right);
        }
    }
    void preOrderDisplay(node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrderDisplay(root.left);
            preOrderDisplay(root.right);
        }
    }

    void postOrderDisplay(node root){
        if(root != null){
            postOrderDisplay(root.left);
            postOrderDisplay(root.right);
            System.out.print(root.data + " ");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Experiment9 tree = new Experiment9();

        tree.root = new node(1);
        tree.root.left = new node(5);
        tree.root.right = new node(10);
        tree.root.left.left = new node(8);
        tree.root.left.right = new node(9);
        tree.root.right.left = new node(11);
        tree.root.right.right = new node(13);

        int choice;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Inorder");
            System.out.println("2. Preorder");
            System.out.println("3. Postorder");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("--------Inorder Tree-------- \n\n");
                    tree.inOrderDisplay(tree.root);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("-------Preorder Tree--------- \n\n");
                    tree.preOrderDisplay(tree.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("------Postorder Tree--------- \n\n");
                    tree.postOrderDisplay(tree.root);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
        
    }
    
}
