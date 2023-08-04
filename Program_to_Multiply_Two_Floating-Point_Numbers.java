import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double num1,num2,num3;
        num1=sc.nextDouble();
        num2=sc.nextDouble();
        num3=num1*num2;
        System.out.printf("%.2f",num3);
    }
}