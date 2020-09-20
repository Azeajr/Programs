#include <iostream>
using namespace std;

int main()
{
    int total = 0, n = 0;
    
    while(total <= 0) {
        cout << "Welcome to NIM. Pick a starting total: ";
        cin >> total;
    }
    
    while(n <= 0) {
        cout << "Pick the highest number to subtract: ";
        cin >> n;
    }
    while(true) {
        if ((total % (n+1)) == n) {
            total = total - n;
            cout << "I am subtracting " << n << ". " << endl;
        } else{
            total--;
            cout << "I am subtracting 1." << endl;
        }
        cout << "New total is " << total << endl;
        if (total <= 0) {
            cout << "I win!" << endl;
            break;
        }
        
        cout << "Enter num to subtract (From 1 to " << n <<"): ";
        cin >> n;
        while (n<1 || n>2) {
            cout << "Input must be 1 or 2." << endl;
            cout << "Re-enter: ";
            cin >> n;
        }
        total = total - n;
        cout << "New total is " << total << endl;
        if (total <= 0) {
            cout << "You win!" << endl;
            break;
        }
    }
    return 0;
}