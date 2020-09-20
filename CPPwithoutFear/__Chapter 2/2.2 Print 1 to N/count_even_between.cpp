#include <iostream>
using  namespace std;

int main()
{
    int n1=0,n2=0,i=0;
    
    cout << "Enter first number: ";
    cin >> n1;
    cout << "Enter second number: ";
    cin >> n2;
    
    
    if  (n1%2 == 0)
    {
        i=n1;
    }
    else
    {
        i=n1+1;
    }
    
    
    
    if (i < n2)
    {
        while(i <= n2)
        {
            cout << i << " ";
            i=i+2;
        }
    }
    else
    {
        while (i >= n2)
        {
            cout << i << " ";
            i=i-2;
        }
    }
    cout << endl;
    
    return 0;
}