/*
---------------------
|  1 |  4 | 15 |  7 |
---------------------
|  8 | 10 |  2 | 11 |
---------------------
| 14 |  3 |  6 | 13 |
---------------------
| 12 |  9 |  5 |    |
---------------------
*/
#include <stdio.h>
#include <conio.h>
#include <stdlib.h>
//getch() system("cls")


int checksimilarArray(int [][4], int [][4]) ;
void spaceindex(int *, int (*)[4]);
void goUp(int *, int (*)[4]);
void goDown(int *, int (*)[4]);
void goLeft(int *, int (*)[4]);
void goRight(int *, int (*)[4]);
void display(int (*)[4]);


int main()
{
    int arr[4][4]= {{1,4,15,7},{8,10,2,11},{14,3,6,13},{12,9,5,0}} ;

    int sortarr[4][4]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,0}} ;

    int index[2]={3,3} ;

    display(arr) ;

    while (1)
    {
        int flag = checksimilarArray(arr,sortarr) ;
        if (flag==1)
        {
            system("cls") ;
            printf("\nYou Won ++");
            display(arr) ;
            printf("\n\nEnter any key to exit ....") ;
            getch();
            break ;
        }
        printf("\nEnter up(u) to move the upper number");
        printf("\nEnter down(d) to move the upper number");
        printf("\nEnter left(l) to move the upper number");
        printf("\nEnter right(r) to move the upper number\n");
        printf("\nEnter Choice : ");
        char op[6];
        scanf("%s",op) ;

        if (op[0]=='u')
        {
            spaceindex(index,arr) ;
            system("cls") ;
            goUp(index,arr);
            display(arr) ;
        }
        else if (op[0]=='d')
        {
            spaceindex(index,arr) ;
            system("cls") ;
            goDown(index,arr);
            display(arr) ;
        }
        else if (op[0]=='l')
        {
            spaceindex(index,arr) ;
            system("cls") ;
            goLeft(index,arr);
            display(arr) ;
        }
        else if (op[0]=='r')
        {
            spaceindex(index,arr) ;
            system("cls") ;
            goRight(index,arr);
            display(arr) ;
        }
        else
        {
            system("cls") ;
            printf("\nWrong input**");
            display(arr) ;
            
        }
    }
    getch() ;
    return 0;
}

int checksimilarArray(int arr[4][4], int sortarr[4][4])
{
    int flag = 0;
    for (int i=0; i<4; i++)
    {
        for (int j=0; j<4; j++)
        {
            if (arr[i][j]!=sortarr[i][j])
            {
                return 0;
            }
            
        }
    }
    return 1;
}


void spaceindex(int *index, int (*arr)[4])
{
    for (int i=0; i<4; i++)
    {
        for (int j=0; j<4; j++)
        {
            if (arr[i][j]==0)
            {
                index[0]=i ;
                index[1]=j ;
            }
        }
    }
}

void goUp(int *index, int (*arr)[4])
{
    if (index[0]==3)
    {
        printf("\n**Wrong Input **");
        return;
    }
    int row=index[0], col=index[1] ;

    int adjacentrow=row+1, adjacentcol=col;

    arr[row][col]=arr[adjacentrow][adjacentcol] ;

    arr[adjacentrow][adjacentcol] = 0 ;
}

void goDown(int *index, int (*arr)[4])
{
    if (index[0]==0)
    {
        printf("\n**Wrong Input **");
        return;
    }
    int row=index[0], col=index[1] ;

    int adjacentrow=row-1, adjacentcol=col;

    arr[row][col]=arr[adjacentrow][adjacentcol] ;

    arr[adjacentrow][adjacentcol] = 0 ;
}

void goLeft(int *index, int (*arr)[4])
{
    if (index[1]==3)
    {
        printf("\n**Wrong Input **");
        return;
    }
    int row=index[0], col=index[1] ;

    int adjacentrow=row, adjacentcol=col+1;

    arr[row][col]=arr[adjacentrow][adjacentcol] ;

    arr[adjacentrow][adjacentcol] = 0 ;
}

void goRight(int *index, int (*arr)[4])
{
    if (index[1]==0)
    {
        printf("\n**Wrong Input **");
        return;
    }
    int row=index[0], col=index[1] ;

    int adjacentrow=row, adjacentcol=col-1;

    arr[row][col]=arr[adjacentrow][adjacentcol] ;

    arr[adjacentrow][adjacentcol] = 0 ;
}

void display(int (*arr)[4])
{
    for (int i=0; i<4; i++)
    {
        printf("\n---------------------");
        printf("\n|");
        for (int j=0; j<4; j++)
        {
            if (arr[i][j]==0)
            {
                printf("    |") ;
            }
            else if (arr[i][j]<10)
            {
                printf("  %d |",arr[i][j]) ;
            }
            else 
            {
                printf(" %d |",arr[i][j]) ;
            }
        }
    }
    printf("\n---------------------");
}