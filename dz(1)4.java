import java.util.Scanner;

public class Nastik4
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int a,b,c,d;
        
        if((N<9999)&(N>1000))        
        {        
            System.out.println("вы ввели 4ех значное число");
            d=N%10;
            System.out.println(d);
            c=(N/10)%10;        
            System.out.println(c);
            b=(N/100)%10;
            System.out.println(b);
            a=N/1000;
            System.out.println(a);
            if((a<b)&(b<c)&(c<d))
            {
                System.out.println("возрастающая последовательность");
            }
            if((a>b)&(b>c)&(c>d))
            {
                System.out.println("убывающая последовательность");
            }
            else
            {
                System.out.println("последовательности нет");
            }
        }
        else
        {
            System.out.println("не 4ех значное число");
        }    

        in.close();
    }
}
