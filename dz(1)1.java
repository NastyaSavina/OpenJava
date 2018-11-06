import java.util.Scanner;

public class dz11
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if((a==b)&(a==c))
        {
            System.out.println("числа одинаковые");
        }
        else
        {
            System.out.println("числа различные");
        }

        in.close();
    }
}
