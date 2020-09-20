#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n = 0;
    int i = 2;
    bool is_prime = true;
    
    cout << "Enter a number and press ENTER: ";
    cin >> n;
    double sqroot = sqrt(n);
    
    while (i <= sqroot) {
        if (n % i == 0) {
            is_prime = false;
            break;
        }
        ++i;
    }
    
    if (is_prime) {
        cout << "Number is prime." << endl;
    } else {
        cout << "Number is not prime." << endl;
    }
    return 0;
}