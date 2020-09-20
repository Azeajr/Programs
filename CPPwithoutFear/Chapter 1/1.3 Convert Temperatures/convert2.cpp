#include <iostream>
using namespace std;

int main() {
    double ctemp;   // Celsius temperature
    double ftemp;   // Fahrenheit temperature
    
    // Get a value of ctemp (Celsius temp).
    
    cout << "Input a Celcius temp and press ENTER: ";
    
    cin >> ctemp;
    
    // Calculate ftemp (Fahrenheit temp) and output.
    ftemp = (ctemp * 1.8) + 32;
    cout << "Fahrenheit temp is: " << ftemp << endl;
    return 0;
}