import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows and columns of matrix: ");
        
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int A[][] = new int[20][20];
        int B[][] = new int[20][20];
        int C[][] = new int[20][20];
        int T[][] = new int[20][20];

        System.out.println("Enter matrix A:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                B[i][j] = sc.nextInt();

        // Addition
        System.out.println("\nSum of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        // Subtraction
        System.out.println("\nSubtraction of matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication (only if square)
        if(r == c){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    C[i][j] = 0;
                    for(int k=0;k<c;k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            System.out.println("\nMultiplication of matrix:");
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("\nMultiplication not possible (not square)");
        }

        // Transpose A
        System.out.println("\nTranspose of matrix A:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                T[i][j] = A[j][i];
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose B
        System.out.println("\nTranspose of matrix B:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                T[i][j] = B[j][i];
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }

        // Identity check A
        boolean flagA = true;
        if(r == c){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i==j && A[i][j]!=1) flagA=false;
                    if(i!=j && A[i][j]!=0) flagA=false;
                }
            }
        } else flagA=false;

        if(flagA)
            System.out.println("\nMatrix A is Identity");
        else
            System.out.println("\nMatrix A is Not Identity");

        // Identity check B
        boolean flagB = true;
        if(r == c){
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    if(i==j && B[i][j]!=1) flagB=false;
                    if(i!=j && B[i][j]!=0) flagB=false;
                }
            }
        } else flagB=false;

        if(flagB)
            System.out.println("Matrix B is Identity");
        else
            System.out.println("Matrix B is Not Identity");

        sc.close();
    }
}
