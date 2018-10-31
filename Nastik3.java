import java.util.Scanner;

public class Nastik3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double r = in.nextDouble();
        double R = in.nextDouble();
        double kr1,kr2,kl;
        kr1=3.1415*r*r;
        kr2=3.1415*R*R;
        kl=kr2-kr1;        
        System.out.println("площадь кольца: "+kl);
        
        in.close();
    }
}
