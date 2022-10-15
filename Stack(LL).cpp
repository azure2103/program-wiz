#include<stdio.h>
#include<stdlib.h>
 
struct stack
{
	int data;
	struct stack* prev;
};

struct stack *top=NULL;

//pop
void pop(struct stack *ptr)
{
    if(ptr==NULL)
    {
	    printf("\nList is Empty:\n");
        return;
    }
    else
    {
        ptr=top;
        top=top->prev ;
        printf("\nThe deleted element is :%d\t",ptr->data);
        free(ptr);
    }
}

//push
void push(struct stack *ptr, int data)
{
	struct stack *temp=(struct stack*)malloc(sizeof(struct stack));
    if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("\nEnter the data:\t" );
    scanf("%d",&temp->data);
    temp->prev =NULL;
    if(top==NULL)
    top=temp;
    else
    {
        temp->prev=top;
        top=temp;
    }
}

//print
void printStack(struct stack *ptr)
{
	if(top==NULL)
    {
        printf("\nList is empty:\n");
        return;
	}
    else
    {
    	ptr=top;
        printf("\nThe List elements are:\n\n");
        while(ptr!=NULL)
        {
            printf("%d\t",ptr->data);
            ptr=ptr->prev;
        }
    }
}

//main
int main()
{
	struct stack *ptr;
	int n;
	ptr=(struct stack*)malloc(sizeof(struct stack));

	for(int i=0;i<5;i++)
	push(ptr,n);
	
	printStack(ptr);
	push(ptr,6)	;
	printStack(ptr);
	pop(ptr);
	printStack(ptr);
}