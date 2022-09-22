import java.util.*;
class Emirp
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int num=n;
        int c=0;
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            c=c+1;
        }
        if (c==2)
        {
            int f=0;
            int sum=0;
            while (n!=0)
            {
                int d=n%10;
                sum=sum*10+d;
                n=n/10;
            }
            for (int j=1;j<=sum;j++)
            {
                if (sum%j==0)
                f=f+1;
            }
            if (f==2)
            System.out.println("Emirp no.");
            else
            System.out.println("Not an emirp no.");
        }
        else
        {
            System.out.println("Not an emirp no.");
        }
    }
}
