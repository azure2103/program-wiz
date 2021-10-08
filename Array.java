import java.util.*;
class Array_1
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int i;
        int a[]=new int[10];
        System.out.println("Enter 10 numbers");
        for (i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        for (i=0;i<10;i++)
        {
            if (a[i]%2==0)
            System.out.println("Even: "+a[i]);
            else
            System.out.println("Odd: "+a[i]);
        }
    }
}
