import java.util.*;

public class var4
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        double x;
        int n,k;
        int f;
        double s=0.0, temp;
        x=in.nextDouble();
        n=in.nextInt();
        for(k=0;k<=n;k++)
        {
            f=1;
            for(int p=k;p>=1;p--)
            {
                f*=p;
            }
            temp=Math.pow(-1,k)*((2*k*k+1)/(2*f))*Math.pow(x,2*k);
            s+=temp;
        }
        System.out.println(s);
        in.close();
    }
}