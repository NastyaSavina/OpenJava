import java.util.*;

public class N32
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        char v;
        System.out.println("�������� �����: ");
        v = in.next().charAt(0);
        if((v=='a')||(v=='e')||(v=='i')||(v=='o')||(v=='u'))
        {
            System.out.println("����� ������� ");
        }
        else
        {
            System.out.println("����� �� ������� ");
        }
        in.close();

    }
}
