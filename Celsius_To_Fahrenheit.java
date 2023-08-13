import java.util.Scanner;
public class Sample
{
    public static void  main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double c,f;
        c=sc.nextDouble();
        f=(c*9/5)+32;
        System.out.printf("%.2f",f);
    }
}