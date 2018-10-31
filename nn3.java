import java.util.*;

public class N3
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.println("введите букву: ");
        ch = in.next().charAt(0);
        switch (ch) {
            case 'a':
            System.out.println("ваша буква гласная ");
                break;
            case 'e':
            System.out.println("ваша буква гласная ");
                break;
            case 'i':
            System.out.println("ваша буква гласная "); 
                break;
            case 'o':
            System.out.println("ваша буква гласная  ");   
                break;
            case 'u':
            System.out.println("ваша буква гласная  ");   
                break;
            default:
            System.out.println("ваша буква негласная  ");
                break;
        }
    }
}
