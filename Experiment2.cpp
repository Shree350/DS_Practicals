#include<iostream>
using namespace std;

int main() {

    int n;
    cout << "Enter size of matrix: ";
    cin >> n;

    int A[20][20], B[20][20], C[20][20], T[20][20];

    cout << "Enter matrix A:\n";
    for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
            cin >> A[i][j];

    cout << "Enter matrix B:\n";
    for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
            cin >> B[i][j];

    // Addition
    cout << "\nThe sum of matrix is:\n";
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            C[i][j] = A[i][j] + B[i][j];
            cout << C[i][j] << " ";
        }
        cout << endl;
    }

    // Subtraction
    cout << "\nThe sub of matrix is:\n";
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            C[i][j] = A[i][j] - B[i][j];
            cout << C[i][j] << " ";
        }
        cout << endl;
    }

    // Multiplication
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            C[i][j] = 0;
            for(int k=0; k<n; k++) {
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }

    cout << "\nThe multiplication of matrix is:\n";
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            cout << C[i][j] << " ";
        }
        cout << endl;
    }

    // Transpose of A
    cout << "\nTranspose of matrix A:\n";
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            T[i][j] = A[j][i];
            cout << T[i][j] << " ";
        }
        cout << endl;
    }

    // Transpose of B
    cout << "\nTranspose of matrix B:\n";
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            T[i][j] = B[j][i];
            cout << T[i][j] << " ";
        }
        cout << endl;
    }

    // Identity check for A
    bool flagA = true;
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            if(i==j && A[i][j] != 1) flagA = false;
            if(i!=j && A[i][j] != 0) flagA = false;
        }
    }

    if(flagA)
        cout << "\nMatrix A is Identity\n";
    else
        cout << "\nMatrix A is Not Identity\n";

    // Identity check for B
    bool flagB = true;
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            if(i==j && B[i][j] != 1) flagB = false;
            if(i!=j && B[i][j] != 0) flagB = false;
        }
    }

    if(flagB)
        cout << "Matrix B is Identity\n";
    else
        cout << "Matrix B is Not Identity\n";

    return 0;
}
