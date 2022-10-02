#include<stdio.h>

void TOH(int n, char A, char B, char C)
{
    if (n>0)
    {
        TOH(n-1,A,C,B) ;
        printf("%d number Disc moved from %c to %c \n",n,A,C) ;
        TOH(n-1,B,A,C) ;
    }
}

int main()
{
    int n;
    printf("Enter number of discs :") ;
    scanf("%d",&n) ;

    TOH(n,'A','B','C') ;

    return 0 ;
}