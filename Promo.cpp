/*
The store sells n items, the price of the i-th item is pi. The store's management is going to hold a promotion: if a customer purchases at least x items, y cheapest of them are free.

The management has not yet decided on the exact values of x and y. Therefore, they ask you to process q queries: for the given values of x and y, determine the maximum total value of items received for free, if a customer makes one purchase.

Note that all queries are independent; they don't affect the store's stock.
*/

#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef unsigned long long ull;

int val()
{
    ll n, q, x, y;
    cin >> n >> q;
    vector<ll> v(n + 1, 0);
    for (int i = 1; i <= n; i++)
    {
        cin >> v[i];
    }
    sort(v.begin(), v.end());
    for (int i = 1; i <= n; i++)
    {
        v[i] += v[i - 1];
    }
    while (q--)
    {
        cin >> x >> y;
        cout << v[n - x + y] - v[n - x] << endl;
    }

    return 0;
}

int main()
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cout.tie(0);
    srand(chrono::high_resolution_clock::now().time_since_epoch().count());
    int t = 1;
    // cin >> t;
    while (t--)
    {
        val();
    }
    return 0;
}