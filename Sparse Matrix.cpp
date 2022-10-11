#include<iostream>
using namespace std;

int main()
{
	int sparse[3][4]={{2,0,0,0},{4,0,0,2},{0,0,0,3}};
	int count=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(sparse[i][j]!=0)
			count++;
		}
	}
	int a[3][count];
	int t=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;j++)
		{
			if(sparse[i][j]!=0)
			{
				a[0][t]=i;
				a[1][t]=j;
				a[2][t]=sparse[i][j];
				t++;
			}
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<count;j++)
		{
			cout<<a[i][j]<<" ";
		}
		cout<<endl;;
	}
	return 0;
}