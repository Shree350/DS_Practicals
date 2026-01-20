#include<iostream>
using namespace std;
int main(){

    int n;
    cout <<"Enter size of matrix:";
    cin>>n;

    int A[20][20],B[20][20],C[20][20],T[20][20];

    cout<<"Enter matrx A:\n";
    for(int i=0; i<n;i++)
        for(int j=0; j<n; j++)
            cin>>A[i][j];

    cout <<"Enter matrix B:\n";
    for(int i=0; i<n; i++)
        for(int j=0; j<n; j++)
            cin>>B[i][j];

            // Addation of matrix
    cout <<"\nThe sum of matrix is \n";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                C[i][j] = A[i][j] + B[i][j];
                cout << C[i][j] <<" ";
            }
            cout << endl;
        }

        // Substraction of matrix
    cout <<"\nThe sub of matrix is :\n";
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                C[i][j] = A[i][j] - B[i][j];
                cout << C[i][j]<<" ";
            }
            cout << endl;
        }

       // Multiplaction of matrix
       for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            C[i][j] = 0;
            for(int k = 0; k<n; k++){
                C[i][j] += A[i][k] * B[k][j];
            }
        }
    }
    cout << "\n The Multiplication of matrix is :\n";
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << C[i][j] << " ";
        }
        cout << endl;
    }


    //Transpose of matrix A
   cout << "\n the Transpose of Matrix A:\n";
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            T[i][j] = A[j][i];
            cout << T[i][j] << " ";
        }
        cout << endl;
    }

    //Transpose of matrix B
    cout << "\n The transpose of matrix B  :\n";
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            T[i][j] = A[j][i];
            cout << T[i][j] << " ";
        }
        cout << endl;
    }



    // Check matrix is identity matrix A
    bool flag = true;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==j && A[i][j] != 1) flag = false;
            if(i!=j && A[i][j] != 0) flag = false;
        }
    }
    if(flag)
        cout <<"\nMatrix A is Identity\n";
    else
        cout <<"\nMatrix A is Not Identity\n";

    
        // Check matrix is identity matrix B
    bool flag = true;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(i==j && B[i][j] != 1) flag = false;
            if(i!=j && B[i][j] != 0) flag = false;
        }
    }

    if(flag)
        cout <<"\nMatrix B is Identity\n";
    else
        cout <<"\nMatrix B is Not Identity\n";


    

            return 0;


}