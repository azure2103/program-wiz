#include <stdio.h>
#include <stdlib.h>
#define N 5
int stack[N];
int top = -1;
void Push();
void Pop();
void Display();
void main()
{
    int choice;
    do
    {
        printf("\nEnter choice : 1.Push 2.Pop 3.Display 4.Exit : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            Push();
            break;
        case 2:
            Pop();
            break;
        case 3:
            Display();
            break;
        case 4:
            exit(0);
        default:
            printf("INVALID CHOICE");
        }
    } while (choice != 0);
}
void Push()
{
    int data;
    printf("Enter data : ");
    scanf("%d", &data);
    if (top == N - 1)
    {
        printf("OVERFLOW");
    }
    else
    {
        top++;
        stack[top] = data;
    }
}
void Pop()
{
    int item;
    if (top == -1)
    {
        printf("UNDERFLOW");
    }
    else
    {
        item = stack[top];
        top--;
        printf("Removed item is : %d", item);
    }
}
void Display()
{
    int i;
    printf("Data in stack are : ");
    for (i = top; i >= 0; i--)
    {
        printf("%d ", stack[i]);
    }
}