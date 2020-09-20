#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter an age and press ENTER: ";
    cin >> n;
    
    if (n >= 0 && n <= 100) {
        cout << "Value is between 0 and 100." << endl;
    } else {
        cout << "Value is not between 0 and 100." << endl;
    }
    return 0;
}