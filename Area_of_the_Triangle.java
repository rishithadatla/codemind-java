import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        double area;
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",area);
    }
}