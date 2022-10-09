#include<stdio.h>
#include<stdlib.h>
void push();
void pop();
void display();
 struct node
    {
        int data;
        struct node *next;
    };
    struct node *head,*newnode, *temp, *top=0;
void main()
{ int choice=0;
 do
   {printf("enter choice 1.push 2.pop 3.display 4.exit\n");
   scanf("%d",&choice);
   switch(choice){
   case 1:
     push();
    break;
    case 2:
     pop();
     break;
    case 3:
    display();
    break;
    case 4:
    exit(0);
    default: 
    printf("wrong input\n");
   }
} while(choice!=4);
}
void push()
{   int x;
    struct node *newcode;
    printf("enter the value to be pushed\n");
    scanf("%d",&x);
    newcode=(struct node*) malloc(sizeof(struct node));
    newcode->data=x;
    newcode->next=top;
    top=newcode;
}
void pop()
{
    struct node *temp;
    temp=top;
    if(temp==0)
    {
        printf("empty stack");
    }
    else
    {
        printf("%d has been popped\n",temp->data);
        top=top->next;
        free(temp);
    }
}
void display()
{
    struct node*temp;
    temp=top;
    if(top==0)
    {
        printf("empty stack");
    }
    else
    {   printf("the stack contains:\n");
        while(temp!=0)
        {
            printf("%d\n",temp->data);
            temp=temp->next;
        }
    }
}