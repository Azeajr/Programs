#include <iostream>
using namespace std;

int main() {
    double ctemp;
    cout << "Input a Celcius temp and press ENTER: ";
    cin >> ctemp;
    
    cout << "Fahr. temp is: " << (ctemp * 1.8) + 32;
    
    cout << endl;
    
    return 0;
}