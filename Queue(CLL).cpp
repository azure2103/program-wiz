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
    temp->prev=NULL;
    if(rear==NULL && front==NULL)
    {
		front=rear=temp;
		rear->prev=front;
	}
	else
	{
		rear->prev=temp;
    	rear=temp;
    	temp->prev=front;
	}
}
void deQueue()
{
	q *ptr=front;
	if(rear==NULL && front==NULL)
	{
		cout<<"\nEmpty Queue";
		return;
	}
	else if(front==rear)
	{
		front=rear=NULL;
		free(ptr);
	}
	else
	{
		cout<<"\nDeleted data: "<<front->data;
		front=front->prev;
		rear->prev=front;
		free(ptr);
	}

}
void print(q *ptr)
{
	if(rear==NULL && front==NULL)
    {
        printf("\nList is empty:\n");
        return;
	}
    else
    {
    	ptr=front;
        printf("\nThe List elements are:\n");
        while(ptr->prev!=front)
        {
            printf("%d\t",ptr->data);
            ptr=ptr->prev ;
        }
        printf("%d\t",ptr->data);
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