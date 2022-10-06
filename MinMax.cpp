#include <iostream>
using namespace std;

int main() {
    int a[30], i, n, max, min;
    cout << "Enter size of array";
    cin >> n;
    cout << "Enter elements of array";
    for(i=0; i<n; i++)
    {
        cin >> a[i];
    }
    min = a[0];
    max = a[n-1];
    for(i=0; i<n; i++)
    {
        if(a[i] < min)
        min = a[i];
        if(a[i] > max)
        max = a[i];
    }
    cout << "The maximum element is " << max << endl;
    cout << "The minimum element is " << min << endl;
    return 0;
}
