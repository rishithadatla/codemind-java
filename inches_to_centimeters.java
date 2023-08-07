import java.util.Scanner;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int centi;
        centi=sc.nextInt();
        double inches;
        inches=2.54*centi;
        System.out.printf("%.2f",inches);
    }
}