#include<bits/stdc++.h>
using namespace std;

typedef struct node 
{
  int item;
  struct node* left;
  struct node* right;
}tree;

// Create Node
tree* createNode(int value)
{
  tree* newNode =(tree*)malloc(sizeof(tree));
  newNode->item = value;
  newNode->left = NULL;
  newNode->right = NULL;

  return newNode;
}

// Inorder traversal
void inorder(tree* root)
{
  if (root == NULL) 
  return;
  inorder(root->left);
  printf("%d ", root->item);
  inorder(root->right);
}

// Preorder traversal
void preorder(tree* root)
{
  if (root == NULL)
  return;
  printf("%d ", root->item);
  preorder(root->left);
  preorder(root->right);
}

// Postorder traversal
void postorder(tree* root)
{
  if (root == NULL)
  return;
  postorder(root->left);
  postorder(root->right);
  printf("%d ", root->item);
}

// Insert in node
tree* insert(tree* root, int value)
{
	if(root==NULL)
	{
		cout<<"\nOut of memory space!";
		return 0;
	}
	else
	{
		if(root->item>value)
		{
			if(root->left!=NULL)
			return insert(root->left,value);
			else
			root->left=createNode(value);
		}
		else
		{
			if(root->right!=NULL)
			return insert(root->right,value);
			else
			root->right=createNode(value);
		}
	}
}

int main()
{
	int n,val;
	cout<<"Enter the range: ";
	cin>>n;
	cout<<"Enter the data:\n";
	cin>>val;
	tree* root = createNode(val);
	for(int i=1;i<n;i++)
	{
		cin>>val;
		insert(root, val);
	}
	
	printf("Inorder traversal\n");
	inorder(root);
	
	printf("\nPreorder traversal\n");
	preorder(root);
	
	printf("\nPostorder traversal\n");
	postorder(root);
	return 0;
}