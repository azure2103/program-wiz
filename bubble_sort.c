#include<stdio.h>
void main()
{
    int arr[20], i, len, new;
    printf("enter the length: ");
    scanf("%d", &len);
    printf("enter the elements in array");
    for (i = 0; i < len; i++)
    {
        scanf("%d", &arr[i]);
    }
     for (i = 0; i < len; i++)
     {
         for (int j = 0; j < len-i; j++)
         {
            if(arr[j]>arr[j+1])
            {
               int key=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=key;
            }
         }
     }
     for (i = 0; i < len; i++)
    {
       
     printf("%d ", arr[i]);
    }
}