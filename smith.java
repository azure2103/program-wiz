import java.util.*;
public class Smith
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.println("Enter a number");
        n=sc.nextInt();
        int num=n;
        int sum=0;
        int y=1;
        int i;
        while (n!=0)
        {
            int d=n%10;
            sum=sum+d;//sum of the digits
            n=n/10;
        }
        int sum1=0;
        for (i=2;i<=num;i++)
        {
            y=num%i;            
            while (y==0)
            {
                if (y == 0)
                {
                    n=i;                    
                    int sum2 = 0;
                    while (n!=0)
                    {
                        int f=n%10;
                        sum2=sum2+f;//sum of the digits
                        n=n/10;
                    }                                
                    sum1 = sum1 + sum2;
                }
                num=num/i;
                y = num%i;                              
            } 
        }
        if (sum1==sum)
        {
            System.out.println("Smith number");
        }
        else
        {
            System.out.println("Not a smith number");
        }
    }
}
