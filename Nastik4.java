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
            System.out.println("vy vveli 4eh znachnoe chislo");
            d=N%10;
            System.out.println(d);//4567 d=7
            c=(N/10)%10;        
            System.out.println(c);
            b=(N/100)%10;
            System.out.println(b);
            a=N/1000;
            System.out.println(a);//4567 a=4
            if((a<b)&(b<c)&(c<d))
            {
                System.out.println("vozrastaushaya posledovatelnost");
            }
            if((a>b)&(b>c)&(c>d))
            {
                System.out.println("ybivaushaya");
            }
            else
            {
                System.out.println("posledovatelnosti net");
            }
        }
        else
        {
            System.out.println("ne 4eh znachnoy chislo");
        }    

        in.close();
    }
}