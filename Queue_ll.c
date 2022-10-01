#include <stdio.h>
#include <stdlib.h>

typedef struct queue
{
	int data;
	struct queue *next;
} queue;

queue *front = NULL;
queue *rear = NULL;

void enQueue()
{
	queue *temp = (queue *)malloc(sizeof(queue));
	if (temp == NULL)
	{
		printf("\nQUEUE OVERFLOW");
		return;
	}

	scanf("%d", &temp->data);
	temp->next = NULL;
	if (front == NULL && rear == NULL)
	{
		front = rear = temp;
		rear->next = front;
		return;
	}
	rear->next = temp;
	rear = temp;
	rear->next = front;
	return;
}

void deQueue()
{
	queue *ptr = front;
	if (front == NULL && rear == NULL)
	{
		printf("\nQUEUE UNDERFLOW");
		return;
	}

	else if (front == rear)
	{
		printf("Deleted data: %d", front->data);
		front = rear = NULL;
		free(ptr);
		return;
	}

	printf("Deleted data: %d", front->data);
	front = front->next;
	rear->next = front;
	free(ptr);

	return;
}

void print(queue *ptr)
{
	if (rear == NULL)
	{
		printf("\nList is empty");
		return;
	}
	else
	{
		ptr = front;
		printf("\nThe List elements are:\n");
		do
		{
			printf("%d ", ptr->data);
			ptr = ptr->next;
		} while(ptr != front);
	}
}

int main()
{
	int n;
	char choice1 = 'y';
	char choice2 = 'y';
	printf("Enter the range: ");
	scanf("%d", &n);
	printf("Enter %d elements:\n", n);
	for (int i = 0; i < n; i++)
		enQueue();
	print(front);
	while (choice1 == 'y' || choice2 == 'y')
	{
		printf("\nDo you want to pop out an element? y/n: ");
		fflush(stdin);
		scanf("%c", &choice1);
		if (choice1 == 'y')
		{
			deQueue();
			print(front);
		}
		printf("\nDo you want to push an element? y/n: ");
		fflush(stdin);
		scanf("%c", &choice2);
		if (choice2 == 'y')
		{
			printf("\nEnter data: ");
			enQueue();
			print(front);
		}

	}
	return 0;
}