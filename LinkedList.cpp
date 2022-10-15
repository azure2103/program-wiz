#include<stdlib.h>
#include <stdio.h>

struct node
{
    int data;
    struct node *next;
};

struct node *head=NULL;

//create Linked List
void createNode()
{
    struct node *temp,*ptr;
    temp=(struct node *)malloc(sizeof(struct node));
    if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("Enter the data:\n");
	scanf("%d",&temp->data);
	temp->next=NULL;
	if(head==NULL)
	head=temp;
    else
    {
        ptr=head;
        while(ptr->next!=NULL)
        ptr=ptr->next;
        ptr->next=temp;
    }
}

//insert beginning
void insertStart()
{
    struct node *temp;
    temp=(struct node *)malloc(sizeof(struct node));
    if(temp==NULL)
    {
        printf("\nOut of Memory Space:\n");
        return;
    }
    printf("\nEnter the data value for the node:\t" );
    scanf("%d",&temp->data);
    temp->next=NULL;
    if(head==NULL)
    head=temp;
    else
    {
        temp->next=head;
        head=temp;
    }
}

//insert end
void insertEnd()
{
        struct node *temp,*ptr;
        temp=(struct node *)malloc(sizeof(struct node));
        if(temp==NULL)
        {
            printf("\nOut of Memory Space:\n");
            return;
        }
        printf("\nEnter the data value for the node:\t" );
        scanf("%d",&temp->data );
        temp->next =NULL;
        if(head==NULL)
        head=temp;
        else
        {
            ptr=head;
            while(ptr->next !=NULL)
            ptr=ptr->next;
            ptr->next =temp;
        }
}

//delete beginning
void deleteStart()
{
    struct node *ptr;
    if(head==NULL)
    {
        printf("\nList is Empty:\n");
        return;
    }
    else
    {
        ptr=head;
        head=head->next ;
        printf("\nThe deleted element is :%d\t",ptr->data);
        free(ptr);
    }
}

//delete end
void deleteEnd()
{
    struct node *temp,*ptr;
    if(head==NULL)
    {
        printf("\nList is Empty:");
        return;
    }
    else if(head->next==NULL)
    {
        ptr=head;
        head=NULL;
        printf("\nThe deleted element is:%d\t",ptr->data);
        free(ptr);
    }
    else
    {
        ptr=head;
        while(ptr->next!=NULL)
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
void printList(struct node *ptr)
{
	if(head==NULL)
    {
        printf("\nList is empty:\n");
        return;
	}
    else
    {
    	ptr=head;
        printf("\nThe List elements are:\n");
        while(ptr!=NULL)
        {
            printf("%d\t",ptr->data );
            ptr=ptr->next ;
        }
    }
}

int main()     
{
	int n;
	printf("\nEnter the range: ");
    scanf("%d",&n);
    
    for(int i=0;i<n;i++)
	createNode();
	
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