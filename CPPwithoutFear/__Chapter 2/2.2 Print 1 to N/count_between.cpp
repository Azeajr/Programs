#include <iostream>
using  namespace std;

int main()
{
    int n1=0,n2=0;
    
    cout << "Enter first number: ";
    cin >> n1;
    cout << "Enter second number: ";
    cin >> n2;
    
    if (n1 < n2)
    {
        while(n1 <= n2)
        {
            cout << n1 << " ";
            n1=n1+1;
        }
    }
    else
    {
        while (n1 >= n2)
        {
            cout << n1 << " ";
            n1=n1-1;
        }
    }
    cout << endl;
    
    return 0;
}