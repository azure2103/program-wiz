#include<stdio.h>
//func to find sum of digits of a number
int sum_of_digits(int n, int sum)
{ 
    sum=sum+n%10;
    n=n/10;
    if(n==0)
    return sum;
    sum_of_digits(n,sum);
}
int main()
{
    int n;
    printf("Enter a number: ");
    scanf("%d",&n);
    printf("Sum of Digits of %d=%d",n,sum_of_digits(n,0));
    return 0;
}
