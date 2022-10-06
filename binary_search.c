#include<stdio.h>
void main(){
    int arr[100];
    int lb=0,up,mid,key_value,i,n,f;
    printf("Enter the no of value u want to store in array :\n");
    scanf("%d",&n);
    printf("Enter the elements in array:\n");
    for(i=0;i<n;i++){
    scanf("%d",&arr[i]);
    }
    printf("Enter the key value:\n");
    scanf("%d",&key_value);
    up=n-1;
    while(lb<=up){
        mid=(lb+up)/2;
        if(arr[mid]==key_value){
           f=1;
            break;
        }
        else if(arr[mid]>key_value){
            up=mid-1;
        }
        else
        lb=mid+1;
    }
    if(f==1){
        printf("Search complete\n");
        printf("%d is at %dth position\n",key_value,mid+1);
    }
    else
        printf("Value is not present in array");

}