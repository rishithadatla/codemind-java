import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i,r,sum=0,temp;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}