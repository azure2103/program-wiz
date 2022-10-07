#include<stdio.h>
#include<stdlib.h>
struct node{
    int info;
    struct node *next;
}*top=NULL;

void trav(struct node *ptr){
    ptr=top;
    printf("THE STACK IS\n");
    while(ptr!=NULL){
        printf("%d\n",ptr->info);
        ptr=ptr->next;
    }
}
void push(){//similar to insert beg
    int val;
    printf("\nEnter the element: ");
    scanf("%d",&val);
    struct node *temp;
    temp=(struct node *)malloc(sizeof(struct node));
    temp->info=val;
    temp->next=top;
    top=temp;
}
int pop(){
    struct node *q;
    if(top==NULL){
        printf("underflow");
        return(-999);
    }
    else{
        int item = top->info;
        q=top;
        top=top->next;
        free(q);
        return(item);
    }
}
int main(){
    int ans=1;
    while(ans){
        printf("\n1.Push\n2.Pop\n3.Disp\n");
        int choice;
        printf("Enter the choice: ");
        scanf("%d",&choice);
        switch (choice)
        {
        case 1:
            push();
            break;
        case 2:
            int b=pop();
            printf("\n%d got popped\n",b);
            break;
        case 3:
            trav(top);
            break;
        
        default:
            break;
        }
        printf("\nContinue?(1/0): ");
        scanf("%d",&ans);
    }
    return 0;
}