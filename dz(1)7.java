import java.util.*;

public class dz17
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("введите значение a и b");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        in.close();
    }
}
