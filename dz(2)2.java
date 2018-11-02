import java.util.*;

public class N2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,l,g;
        System.out.println("введите количество лет дракону: ");
        n = in.nextInt();
        if(n<=199)
        {
            l=3*n;
            System.out.println("количество голов у дракона: "+ l);
            g=l*2;
            System.out.println("количество глаз: "+ g);
        }
        if((199<n)&(n<=299))
        {
            l=3*199+2*(n-199);
            System.out.println("количество голов у дракона: "+ l);
            g=l*2;
            System.out.println("количество глаз: "+ g);
        }
        if((299<=n)&(n>=300))
        {
            l=3*199+2*100+1*(n-299);
            System.out.println("количество голов у дракона: "+ l);
            g=l*2;
            System.out.println("количество глаз: "+ g);
        }
        in.close();


    }
}