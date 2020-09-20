#include <iostream>
using namespace std;

int main() {
    double ftemp;
    cout << "Input a Fahrenheit temperature and Press ENTER: ";
    cin >> ftemp;
    
    cout << "Celcius temperature is: " << (ftemp-32)/1.8;
    cout << endl;
    return 0;
}