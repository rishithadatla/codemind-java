import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a>0)
        {
            System.out.print("Positive Number");
        }
        else
        {
            System.out.print("Negative Number");
        }
    }
}