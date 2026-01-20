#include <iostream>
using namespace std;

int main() {

    int i, a[5], b[5], c[5];
    int ch, sum = 0, sub = 0;
    char x;

    do {
        cout << "\n1. Create" << endl;
        cout << "2. Display" << endl;
        cout << "3. Sum" << endl;
        cout << "4. Substraction" << endl;
        cout << "Enter your choice: ";
        cin >> ch;

        switch(ch) {
        case 1:
            cout << "Enter 5 elements for array a: ";
            for(i = 0; i < 5; i++)
                cin >> a[i];
            break;

        case 2:
            cout << "Elements in array a are: ";
            for(i = 0; i < 5; i++)
                cout << a[i] << " ";
            cout << endl;
            break;

        case 3:
            sum = 0;
            for(i = 0; i < 5; i++)
                sum += a[i];
            cout << "Sum = " << sum << endl;
            break;

        case 4:
            cout << "Enter 5 elements for array b: ";
            for(i = 0; i < 5; i++)
                cin >> b[i];
            cout << "Subtraction (a - b) = ";
            for(i = 0; i < 5; i++) {
                c[i] = a[i] - b[i];
                cout << c[i] << " ";
            }
            cout << endl;
            break;

        default:
            cout << "Invalid choice" << endl;
        }

        cout << "Continue? (y/n): ";
        cin >> x;

    } while(x == 'y' || x == 'Y');

    return 0;
}
