#include <iostream>
using namespace std;

int main()
{
    int n1=0,n2=0;
    cout << "Enter first number and press ENTER: ";
    cin >> n1;
    
    cout << "Enter second number and press ENTER: ";
    cin >> n2;
    
    if (n1 <= n2){
        while (n1 <= n2){
        cout << n1 << " ";
        n1++;
        }
    }else{
        while (n1 >= n2){
        cout << n2 << " ";
        n2++;
        }
    }
    cout << endl;
    return 0;
}