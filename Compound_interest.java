import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double p,r,t,c;
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        c=p*(Math.pow((1+r/100),t));
        System.out.printf("%.2f",c);
    }
}