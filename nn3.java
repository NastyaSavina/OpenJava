import java.util.*;

public class nn3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.println("�������� �����: ");
        ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
            System.out.println("���� ����� ������� ");
                break;
            case 'e':
            System.out.println("���� ����� ������� ");
                break;
            case 'i':
            System.out.println("���� ����� ������� "); 
                break;
            case 'o':
            System.out.println("���� ����� ������� ");   
                break;
            case 'u':
            System.out.println("���� ����� ������� ");   
                break;
            default:
            System.out.println("���� ����� �� ������� ");
                break;
        }
    }
}