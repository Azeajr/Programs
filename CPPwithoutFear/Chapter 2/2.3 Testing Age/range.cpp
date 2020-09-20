#include <iostream>
using namespace std;

int main(){
    int n;
    cout << "Enter a number and press ENTER ";
    cin >> n;
    
    if (n >= 0 and n <= 100){
        cout << "This number is between 0 and 100 inclusive." << endl;
    } else{
        cout << "This number is not between 0 and 100 inclusive." << endl;
    }
    return 0;
}