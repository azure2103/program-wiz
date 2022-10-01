/*
Question: Given an array a of n elements, print any value that appears 
at least three times or print -1 if there is no such value.
*/

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;

int val()
{
    int n;
    cin >> n;
    unordered_map<int, int> ump;
    for (int i = 0; i < n; i++)
    {
        int a;
        cin >> a;
        ump[a]++;
    }
    for (auto x : ump)
    {
        if (x.second > 2)
        {
            cout << x.first << endl;
            return 0;
        }
    }

    cout << -1 << endl;

    return 0;
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    srand(chrono::high_resolution_clock::now().time_since_epoch().count());
    int t = 1;
    cin >> t;
    while (t--)
    {
        val();
    }
    return 0;
}