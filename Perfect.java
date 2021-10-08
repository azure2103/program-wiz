import java.util.*;
class Array_4
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        int sum;
        System.out.println("Enter the size of the array");
        n=sc.nextInt();
        System.out.println("Enter the numbers of the array");
        int a[]=new int[n];
        for (i=0;i<n;i++)
        a[i]=sc.nextInt();
        for (i=0;i<n;i++)
        {
            sum=0;
            for (int j=1;j<a[i];j++)
            {
                if (a[i]%j==0)
                sum=sum+j;
            }
                if (sum==a[i])
                System.out.println(a[i]+" is a perfect number");
                else
                System.out.println(a[i]+" is not a perfect number");
                          
        }
    }
}
