#include<stdio.h>
#include<stdlib.h>
#define N 5
int queue [N];
int front=-1; int rear =-1;
void enqueue();
void dequeue();
void display();
void peek();
void main()
{
    int choice=0;
 do
   {printf("enter choice 1.enqueue 2.dequeue 3.display 4.peek 5.exit\n");
   scanf("%d",&choice);
   switch(choice){
   case 1:
     enqueue();
    break;
    case 2:
    dequeue();
     break;
    case 3:
    display();
    break;
    case 4:
    peek();
    case 5:
    exit(0);
    default: 
    printf("wrong input\n");
   }
} while(choice!=5);
}

void enqueue()
{
    int x;
    printf("enter the no u want to insert\n");
    scanf("%d",&x);
    if (rear== N-1)
    {
        printf("overflow\n");
    }
    else if(rear==-1 && front==-1)
    {
        front=0;
        rear=0;
        queue[rear]=x;
    }
    else
    {
        rear++;
        queue[rear]=x;
    }
}
void dequeue()
{
    if(front==-1 && rear==-1)
    {
        printf("empty queue\n");
    }
    else if(rear==front)
    { printf("deleted item is %d\n",queue[front]);
        front=rear=-1;
    }
    else
    {
        printf("the deleted element is %d\n",queue[front]);
        front++;
    }
}
void display()
{
    int i;
    printf("The elements are:\n");
    if(front==-1 && rear==-1)
    {
        printf("empty queue");
    }
    else
    {
        for(i=front;i<rear+1;i++)
        {
            printf("%d\n",queue[i]);
        }
    }
}
void peek()
{
    if(rear==-1 && front==-1)
    {
        printf("empty queue");
    }
    else
    {
        printf(" the front element is %d", queue[front]);
    }
}

