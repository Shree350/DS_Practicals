import java.util.Scanner;

class node {
    int data;
    node left, right;

    node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {
    node root;
    Scanner sc = new Scanner(System.in);

    // Create Tree
    node createTree() {
        System.out.print("Enter data (-1 for NULL): ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        node newNode = new node(data);

        System.out.println("Enter left child of " + data);
        newNode.left = createTree();

        System.out.println("Enter right child of " + data);
        newNode.right = createTree();

        return newNode;
    }

    // Traversals
    void inOrderDisplay(node root) {
        if (root != null) {
            inOrderDisplay(root.left);
            System.out.print(root.data + " ");
            inOrderDisplay(root.right);
        }
    }

    void preOrderDisplay(node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderDisplay(root.left);
            preOrderDisplay(root.right);
        }
    }

    void postOrderDisplay(node root) {
        if (root != null) {
            postOrderDisplay(root.left);
            postOrderDisplay(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n------ MENU ------");
            System.out.println("1. Create Tree");
            System.out.println("2. Inorder");
            System.out.println("3. Preorder");
            System.out.println("4. Postorder");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("--------Create Tree--------");
                    tree.root = tree.createTree();
                    break;

                case 2:
                    if (tree.root == null)
                        System.out.println("Tree is empty");
                    else {
                        System.out.print("--------Inorder Tree--------\n\n");
                        tree.inOrderDisplay(tree.root);
                        System.out.println();
                    }
                    break;

                case 3:
                    if (tree.root == null)
                        System.out.println("Tree is empty");
                    else {
                        System.out.print("--------Preorder Tree--------\n\n");
                        tree.preOrderDisplay(tree.root);
                        System.out.println();
                    }
                    break;

                case 4:
                    if (tree.root == null)
                        System.out.println("Tree is empty");
                    else {
                        System.out.print("--------Postorder Tree--------\n\n");
                        tree.postOrderDisplay(tree.root);
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
