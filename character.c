#include <stdio.h>
void main()
{
    int i, j, n, a[50][50];
    char b='$';
    char c='!';
    char d='@';
    printf("Enter the value of n : \n");
    scanf("%d", &n);
    if (n <= 10)
    {
        for (i = 0; i < n; i++)
        {
            a[i][i] = d;
        }
        for (i = 0; i < n; i++)
        {
            for (j = n - i - 1; j < n; j++)
            {
                a[i][j] = d;
                break;
            }
        }
        if (n % 2 != 0)
        {
            for (i = 0; i < (n - 1) / 2; i++)
            {
                for (j = i + 1; j < n - i - 1; j++)
                {
                    a[i][j] = b;
                }
            }
            for (i = n - 1; i > (n - 1) / 2; i--)
            {
                for (j = n - i; j < i; j++)
                {
                    a[i][j] = b;
                }
            }
        }
        else
        {
            for (i = 0; i < n / 2 - 1; i++)
            {
                for (j = i + 1; j < n - i - 1; j++)
                {
                    a[i][j] = b;
                }
            }
            for (i = n - 1; i > n / 2; i--)
            {
                for (j = n - i; j < i; j++)
                {
                    a[i][j] = b;
                }
            }
        }
        for (i = 0; i < n; i++)
        {
            for (j = 0; j < n; j++)
            {
                if (a[i][j] == d || a[i][j] == b)
                {
                    continue;
                }
                else
                {
                    a[i][j] = c;
                }
            }
        }
    }
    else
    {
        printf("WRONG INPUT");
    }
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%c ", a[i][j]);
        }
        printf("\n");
    }
}