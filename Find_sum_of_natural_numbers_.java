import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        i=n*(n+1)/2;
        System.out.printf("%d",i);
    }
}