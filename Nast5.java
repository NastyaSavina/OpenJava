import java.util.Scanner;

public class Nast5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N ,v,s,a,b,c,d,p;  
        double ar,ge;  
        System.out.println("введите 6ти значное число");
        N = in.nextInt();
        if((N<=999999)&(N>=100000))
        {
            System.out.println("вы ввели 6ти значное число");
            d=N%10;
            System.out.println(+ d) ;
            c=(N/10)%10;
            System.out.println(+ c) ;
            b=(N/100)%10;
            System.out.println(+ b) ;
            a=(N/1000)%10;
            System.out.println(+ a) ;
            s=(N/10000)%10;
            System.out.println(+ s) ;
            v=N/100000;
            System.out.println(+ v) ;
            ar=(v+s+a+b+c+d)/6;
            System.out.println("среднее арифметическое "+ ar);
            p=v*s*a*b*c*d;
            ge=Math.pow(p,1/6.0);
            System.out.println("среднее геометрическое"+ ge);
        }
        
            else
            {
                System.out.println("не 6ти значное число");
    
            }
            in.close();
    
        
    }
}
