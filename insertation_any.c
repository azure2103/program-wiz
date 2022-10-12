#include <stdio.h>
#include <stdlib.h>
void main()
{
    struct node
    {
        int data;
        struct node *next;
    };
    struct node *head, *temp, *newnode;
    head = 0;
    int choice = 1, count = 0;
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
    temp = head;
    while (temp != 0)
    {
        count++;
        temp = temp->next;
    }
    //    at any pos
    int pos,i=1;
    printf("enter the pos");
    scanf("%d",&pos);
    if (pos>count)
    {
        printf("invalid");
    }
    else
    {
        temp=head;
        while(i<pos-1)
        {
            temp=temp->next;
            i++;

        }
       newnode = (struct node *)malloc(sizeof(struct node));
       printf("enter data");
       scanf("%d",&newnode->data);
       newnode->next=temp->next;
       temp->next=newnode;
    }
    temp=head;
    while(temp!=0)
    {   
        printf("%d ",temp->data);
        temp=temp->next;
    }
}