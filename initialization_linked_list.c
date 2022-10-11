#include <stdio.h>
#include<stdlib.h>
void main()
{
    struct node
    {
        int data;
        struct node *next;
    };
    struct node *newnode, *temp, *head;
    head = 0;
    int choice = 1;
    while (choice)
    {
        newnode = (struct node *)malloc(sizeof(struct node));
        printf("Enter data : ");
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
        printf("Do u want to continue(0,1) : ");
        scanf("%d", &choice);
    }
    temp = head;
    printf("Linked list are : ");
    while (temp != 0)
    {
        printf("%d ", temp->data);
        temp = temp->next;
    }
}