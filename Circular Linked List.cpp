#include<stdlib.h>
#include <stdio.h>

typedef struct node
{
    int data;
    struct node *next;
}n;

n *head=NULL;

//create Linked List
void createNode()
{ 
    n *temp,*ptr;
    temp=(n *)malloc(sizeof(n));
    if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("Enter the data:\n");
	scanf("%d",&temp->data);
	
	if(head==NULL)
	{
		head=temp;
		temp->next=head;
	}
    else
    {
        ptr=head;
        while(ptr->next!=head)
        ptr=ptr->next;
        temp->next=head;
        ptr->next=temp;
    }
}

//insert beginning
void insertStart()
{
    int data;
    n *temp,*ptr;
    temp=(n *)malloc(sizeof(n));
    if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("Enter the data:\n");
	scanf("%d",&temp->data);
	
	if(head==NULL)
	{
		head=temp;
		temp->next=head;
	}
    else
    {
        ptr=head;
        while(ptr->next!=head)
        ptr=ptr->next;
        temp->next=head;
        ptr->next=temp;
        head=temp;
    }
}

//insert end
void insertEnd()
{
    int data;
    n *temp,*ptr;
    temp=(n *)malloc(sizeof(n));
    if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("Enter the data:\n");
	scanf("%d",&temp->data);
	
	if(head==NULL)
	{
		head=temp;
		temp->next=head;
	}
    else
    {
        ptr=head;
        while(ptr->next!=head)
        ptr=ptr->next;
        temp->next=head;
        ptr->next=temp;
    }
}

//delete beginning
void deleteStart()
{
    n *ptr;
    if(head==NULL)
    {
        printf("\nList is Empty:\n");
        return;
    }
    else if(head->next==head)
    {
    	head=NULL;
    	free(head);
	}
    else
    {
        ptr = head;   
        while(ptr -> next != head)  
        ptr = ptr -> next;   
        ptr->next = head->next;  
        free(head);  
        head = ptr->next;  
        printf("\nThe deleted element is:%d\t",ptr->data);  
    }
}

//delete end
void deleteEnd()
{
    n *temp,*ptr;
    if(head==NULL)
    {
        printf("\nList is Empty:");
        return;
    }
    else if(head->next==head)
    {
        ptr=head;
        head=NULL;
        printf("\nThe deleted element is:%d\t",ptr->data);
        free(ptr);
    }
    else
    {
        ptr=head;
        while(ptr->next!=head)
        {
            temp=ptr;
            ptr=ptr->next;
        }
        temp->next=NULL;
        printf("\nThe deleted element is:%d\t",ptr->data);
        free(ptr);
    }
}

//to Print List
void printList(n *ptr)
{
	if(head==NULL)
    {
        printf("\nList is empty:\n");
        return;
	}
    else
    {
        printf("\nThe List elements are:\n");
        while(ptr->next!=head)
        {
            printf("%d\t",ptr->data);
            ptr=ptr->next ;
        }
        printf("%d\n",ptr->data);
    }
}

int main()     
{
	int n;
	printf("\nEnter the range: ");
    scanf("%d",&n);
    
    for(int i=0;i<n;i++)
	createNode();
	printList(head);
	int choice=0;
    printf("1.Insert at the beginning\n");
    printf("2.Insert at the end\n");
    printf("3.Delete from beginning\n");
    printf("4.Delete from the end\n");
    printf("Enter your choice: ");
    scanf("%d",&choice);
    
	switch(choice)
    {
        case 1: 
                insertStart();
                printList(head);
                break;
		case 2:
                insertEnd();
                printList(head);
                break;
        case 3:
                deleteStart();
                printList(head);
                break;
        case 4:
                deleteEnd();
                printList(head);
                break;                     
        default:
                printf("\nWrong Choice:n");
                break;
    }
    return 0;
}