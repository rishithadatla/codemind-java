import java.util.Scanner;
public class Odd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
    }
}