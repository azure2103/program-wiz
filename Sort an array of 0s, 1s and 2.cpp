#include<bits/stdc++.h>
using namespace std;



 // } Driver Code Ends
class Solution
{
    public:
    void sort012(int a[], int n)
    {
     int low=0, mid=0, high = n-1;
        int choice;
        
        while(mid <= high){
            choice = a[mid];
            
            switch(choice){
                case 0:
                    swap(a[low++], a[mid++]);
                    break;
                case 1:
                    mid++;
                    break;
                case 2: 
                    swap(a[mid], a[high--]);
                    break;
            }
        }
    } 
    
    
};

// { Driver Code Starts.
int main() {

    int t;
    cin >> t;

    while(t--){
        int n;
        cin >>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin >> a[i];
        }

        Solution ob;
        ob.sort012(a, n);

        for(int i=0;i<n;i++){
            cout << a[i]  << " ";
        }

        cout << endl;
        
        
    }
    return 0;
}

  // } Driver Code Ends
