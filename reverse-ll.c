#include<stdio.h>
#include<stdlib.h>
void main()
{
    struct node
    {
        int data;
        struct node *next;
    };
    struct node *head, *temp, *newnode,*prevnode,*currentnode,*nextnode;
    head = 0;
    int choice = 1;
    while (choice)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("enter data\n");
        scanf("%d", &newnode->data);
        newnode->next = 0;
        if (head == 0)
        {
            head = temp = newnode;
        }
        else
        {
            temp->next = newnode;
            temp = newnode;
        }
        printf("wanna continue(0,1)?\n");
        scanf("%d", &choice);
    }
    prevnode=0; 
    currentnode=nextnode=head;
    while(nextnode!=0)
    {
        nextnode=nextnode->next;
        currentnode->next=prevnode;
        prevnode=currentnode;
        currentnode=nextnode;

    }
    head=prevnode;
 temp=head;
     while(temp!=0)
    {   
        printf("%d ",temp->data);
        temp=temp->next;
    }
}