import java.util.Scanner;
public class Si
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p,t,r,si;
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        si=(p*t*r)/100;
        System.out.printf("%d",si);
    }
}