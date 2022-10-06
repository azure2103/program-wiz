#include<stdio.h>
void main()
{
    int arr[20], i, len, new,j;
    printf("enter the length: ");
    scanf("%d", &len);
    printf("enter the elements in array");
    for (i = 0; i < len; i++)
    {
        scanf("%d", &arr[i]);
    } 
    for ( i = 0; i < len-1; i++)
     {  
    for ( j = i+1; j < len; j++)
    {
        if(arr[i]>arr[j])
        {new=arr[j];
        arr[j]=arr[i];
        arr[i]=new;
        }
     }
     }
    for (i = 0; i < len; i++)
    {
        printf("%d", arr[i]);
    } 
} 