import java.util.Scanner;
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        if(n%2!=0)
        {
            System.out.print("Prime");
        }
        else
        {
            System.out.print("Not Prime");
        }
    }
}