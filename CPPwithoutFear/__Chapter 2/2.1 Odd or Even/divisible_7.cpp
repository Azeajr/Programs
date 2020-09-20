#include <iostream>
using namespace std;

int main()
{
    int n;
    cout << "Enter a number and press ENTER: ";
    cin >> n;
    if (n%7 == 0)
    {
        cout << "The number is divisble by 7." << endl;
    }
    else
    {
        cout << "The number is not divisble by 7." << endl;
    }
    return 0;
}