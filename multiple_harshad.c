#include<stdio.h>
void main()
{   int no,x,sum=0,num,f,a;
    printf("enter no");
    scanf("%d",&no);
    x=no;
    while(x>=10)
    {   sum=0;
        while(no!=0)
    {
        num=no%10;
        no=no/10;
        sum+=num;
    }
   
    if(x%sum==0)
    {   f=0;
        a=x/sum;
        x=a;
        no=a;
    }
    else
    {   f=1;
        printf("not harshad");
        break;
    }
}
if(f==0)
{
    printf("harshad");
}
}