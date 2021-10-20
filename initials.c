#include<stdio.h>
int main()
{
	char w[50];
	int i;
	printf("\nEnter the name : ");
	gets(w);
	//puts(w);
	printf("\nThe initials are : ");
	for(i=0;i<49;i++)
	{
		if(w[i]=='\0')
		break;
		else if(i==0)
		printf("%c ",w[i]);
		else if(w[i]==' ')
		printf("%c ",w[i+1]);
	}
}
