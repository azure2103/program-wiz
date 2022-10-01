#include <stdio.h>
#include <stdlib.h>
#define MAX 10
typedef struct stack
{
    int data[MAX];
    int top;
}Stack;

int pop(Stack *s)
{
    //UNDERFLOW CONDITION
    if(s->top==-1)
    {
        printf("Stack underflow");
        return -1;
    }
    s->top -= 1;
    return(s->data[s->top + 1]); //returns popped element
}

void push(Stack *s, int num)
{
    //OVERFLOW CONDITION
    if(s->top == MAX-1)
    {   printf("Stack overflow");
        return ;
    }
    s->top += 1;
    s->data[s->top] = num; //pushes given element
    printf("Element pushed. Successful!\n");
}

void print(Stack *s)
{
    int temp = s->top;
    while(temp != -1)
    {
        printf("%d ", s->data[temp]);
        temp -=1;
    }
    return ;
}

int main()
{
    Stack *s;
    s = (Stack *)malloc(sizeof(Stack));
    s->top = -1;
    int n, num;
    printf("Enter the range of elements you want to input: ");
    scanf("%d", &n);
    printf("Enter %d numbers\n", n);
    while(n != 0)
    {
        scanf("%d", &num);
        push(s, num);
        n -= 1;
    }
    print(s);
    char choice = 'y';
    while(choice == 'y')
    {
        printf("\nDo you want to pop out an element? y/n: ");
        fflush(stdin);
        scanf("%c", &choice);
        if(choice == 'y')
            printf("%d", pop(s));
    }

    return 0;
}