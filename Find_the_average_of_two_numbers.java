import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        double num3;
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=(num1+num2)*0.5;
        System.out.printf("%.4f",num3);
    }
}