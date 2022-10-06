#include <stdio.h>
void main()
{
    int i, j, row, col, a[100][100], n=0, c = 0;
    printf("Enter the value of rows and column : ");
    scanf("%d%d", &row, &col);
    printf("Enter the value in matrix : ");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            scanf("%d", &a[i][j]);
        }
    }
    printf("Matrix is : \n");
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            printf("%d  ", a[i][j]);
        }
        printf("\n");
    }
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            if (a[i][j] != 0)
            {
                n++;
            }
        }
    }
    int b[3][n];
    for (i = 0; i < row; i++)
    {
        for (j = 0; j < col; j++)
        {
            if (a[i][j] != 0)
            {
                b[0][c] = i;
                b[1][c] = j;
                b[2][c] = a[i][j];
                c++;
            }
        }
    }
    printf("Sparse matrix is : \n");
    for (i = 0; i < 3; i++)
    {
        for (j = 0; j < n; j++)
        {
            printf("%d  ", b[i][j]);
        }
        printf("\n");
    }
}