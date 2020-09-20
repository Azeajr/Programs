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
        if (n2 % 2!=0){
            n2--;
        }
        while (n1 <= n2){
            cout << n2 << " ";
            n2-=2;
        }
    }else{
        if (n1 % 2!=0){
            n1--;
        }
        while (n1 >= n2){
            cout << n1 << " ";
            n1-=2;
        }
    }
    cout << endl;
    return 0;
}