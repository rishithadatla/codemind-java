import java.util.Scanner;
public class Grades
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int p,c,b,m,cs;
        p=sc.nextInt();
        c=sc.nextInt();
        b=sc.nextInt();
        m=sc.nextInt();
        cs=sc.nextInt();
        double percentage;
        percentage=(p+c+b+m+cs)*100/500;
        if(percentage>=90)
        {
            System.out.println("Grade A");
        }
        else if(percentage>=80)
        {
            System.out.println("Grade B");
        }
        else if(percentage>=70)
        {
            System.out.println("Grade C");
        }
        else if(percentage>=60)
        {
            System.out.println("Grade D");
        }
        else if(percentage>=40)
        {
            System.out.println("Grade E");
        }
        else if(percentage<40)
        {
            System.out.println("Grade F");
        }
    }
}