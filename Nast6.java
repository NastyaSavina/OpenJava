import java.util.Scanner;

public class Nast6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N ,v,s,a,b,c,d,p;  
        System.out.println("vvedite 7mi znachnoe chislo");
        N= in.nextInt();
    if((N<=9999999)&(N>=1000000))
    {
        System.out.println("vy vveli 7m znachnoe chislo");
        d=N%10;
        c=(N/10)%10;
        b=(N/100)%10;
        a=(N/1000)%10;
        s=(N/10000)%10;
        v=(N/100000)%10;
        p=N/1000000;
        //////
        int temp;
        temp=d;
        d=p;
        p=temp;
        temp=v;
        v=c;
        c=temp;
        temp=b;
        b=s;
        s=temp;
        System.out.print(+ p);
        System.out.print(+v);
        System.out.print(+ s);
        System.out.print(+ a);
        System.out.print(+ b);
        System.out.print(+ c);
        System.out.print(+ d);
        
    }
        
        
    else
    {
        System.out.println("ne 7m znachnoe chislo");

    }
    in.close();
    
        
    }
}