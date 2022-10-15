#include<bits/stdc++.h>
using namespace std;

//To check whether the input string is operator or not
int isOperator(char string)
{
	switch(string)
	{
		case '+':
			return 1;
		case '-':
			return 1;
		case '*':
			return 1;
		case '%':
			return 1;
		case '/':
			return 1;
		case '(':
			return 1;
	}
	return 0;
}

//To check whether the input string is operand or not
int isOperand(char string)
{
	if(string>=65 && string<=90 || string>=97 && string<=122)
	return 1;
	return 0;
}

//To return precendence value when operator is in Stack
int inStackPre(char string)
{
	switch(string)
	{
		case '+':
		case '-':
			return 2;
		case '*':
		case '%':
		case '/':
			return 4;
		case '(':
			return 0;
	}
}

//To return precendence value when operator is in String
int outStackPre(char string)
{
	switch(string)
	{
		case '+':
		case '-':
			return 1;
		case '*':
		case '%':
		case '/':
			return 3;
		case '(':
			return 10;
	}
}

//infix to postfix convertion
void infixTopostfix(char input[])
{
	stack <char> s;
	int i=0;
	while(input[i] != '\0')
	{
		if(isOperand(input[i]))
		cout<<input[i];
		else if(isOperator(input[i]))
		{
			if(s.empty() || outStackPre(input[i])>inStackPre(s.top()))			
			s.push(input[i]);
			else
			{
				while(!s.empty() && outStackPre(input[i])<inStackPre(s.top()))
				{
					cout<<s.top();
					s.pop();
				}
				s.push(input[i]);
			}
		}
		else if(input[i] == ')')
		{
			while(s.top() != '(')
			{
				cout<<s.top();
				s.pop();
			}
			s.pop();
		}
		i++;
	}
	while (!s.empty())
	{
        if (s.top() == '(')
		{
            cout<<"\n Wrong input\n";
            exit(1);
        }
        cout<<s.top();
        s.pop();
  	}
}


int main()
{
	char string[100];
	cout<<"Enter the infix expression: ";
	cin>>string;
	infixTopostfix(string);
	return 0;
}