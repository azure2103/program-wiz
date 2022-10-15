#include<stdio.h>
#include<stdlib.h>
#include<iostream>
using namespace std;

typedef struct queue
{
	int data;
	struct queue* prev;
}q;

q* rear=NULL;
q* front=NULL;

void enQueue()
{
	q *temp=(q*)malloc(sizeof(q));
	if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("\nEnter the data:\t" );
    scanf("%d",&temp->data);
    temp->prev =NULL;
    if(rear==NULL)
    {
		rear=temp;
    	front=temp;
    	return;
	}
    rear->prev=temp;
    rear=temp;
    return;
}
void deQueue()
{
	q *ptr;
	if(rear==NULL)
	{
		cout<<"\nEmpty Queue";
		return;
	}
	ptr=front;
	cout<<"\nDeleted data: "<<front->data;
	front=ptr->prev;
	return;
}
void print(q *ptr)
{
	if(rear==NULL)
    {
        printf("\nList is empty:\n");
        return;
	}
    else
    {
    	ptr=front;
        printf("\nThe List elements are:\n");
        while(ptr!=NULL)
        {
            printf("%d\t",ptr->data);
            ptr=ptr->prev ;
        }
    }
}
int main()
{
	int n;
	printf("Enter the range: ");
	cin>>n;
	for(int i=0;i<n;i++)
	enQueue();
	print(front);
	deQueue();
	print(front);
}