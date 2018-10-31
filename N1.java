import java.util.*;

public class N1
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("vvedite x");
            double x1,x2,x3;
            x1=in.nextDouble();
            x2=in.nextDouble();
            x3=in.nextDouble();
            System.out.println("vvedite y");
            double y1,y2,y3;
            y1=in.nextDouble();
            y2=in.nextDouble();
            y3=in.nextDouble();
            double ab,bc,ca;
            ab=Math.pow(x1-x2,2)+Math.pow(y1-y2,2);
            ab=Math.sqrt(ab);
            bc=Math.pow(x2-x3,2)+Math.pow(y2-y3,2);
            bc=Math.sqrt(bc);
            ca=Math.pow(x3-x1,2)+Math.pow(y3-y1,2);
            ca=Math.sqrt(ca);
            if((ab<bc+ca)&(bc<ca+ab)&(ca<ab+bc))
            {
                System.out.println("tochki vershiny");
                ab=Math.pow(ab,2);
                bc=Math.pow(bc,2);
                ca=Math.pow(ca,2);
                if((ab<bc+ca)||(bc<ca+ab)||(ca<ab+bc))
                {
                    System.out.println("treugol priam");
                }
            }
            else
            {
               System.out.println("tochki ne vershiny");
            }
        
        
        }
    }
}