#include<stdio.h>
#include<stdlib.h>
 
typedef struct stack
{
	int data[10];
	int top;
}st;

//pop
int pop(st *ptr)
{
	if(ptr->top==-1)
	return -1;
	ptr->top -=1;
	return(ptr->data[ptr->top+1]);
}

//push
void push(st* ptr,int data)
{
	if(ptr->top==9)
	return;
	ptr->data[ptr->top+1]=data;
	ptr->top+=1;
}

//print
void printStack(st* ptr)
{
	printf("\n\n");
	int temp=ptr->top;
	while(temp !=-1)
	{
		printf("%d\t", ptr->data[temp]);
		temp-=1;
	}
	return;
}

//main
int main()
{
	int n,r;
	st *ptr;
	ptr=(st*)malloc(sizeof(st));
	ptr->top=-1;
	printf("Enter the range: ");
	scanf("%d",&r);
	printf("Enter values:\n");
	while(r != 0)
	{
		scanf("%d",&n);
		push(ptr,n);
		r-=1;
	}
	printStack(ptr);
	push(ptr,6)	;
	printStack(ptr);
	int i=pop(ptr);
	printf("\n\nDeleted element is: %d", i);
	printStack(ptr);
}