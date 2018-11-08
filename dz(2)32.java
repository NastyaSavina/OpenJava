import java.util.*;

public class dz232
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("введите букву ");
        int flag=0;
        char ch;
        ch = in.next().charAt(0);
        char word[];
        word=new char[5];
        for(int i=0;i<5;i++)
        {
            word[i]=0;

        }
        word[0]='a';
        word[1]='e';
        word[2]='o';
        word[3]='u';
        word[4]='i';
        for(int i=0;i<5;i++)
        {
            if(ch==word[i])
            {
                flag++;
                if(flag==1)
                {
                    System.out.println("гласная ");
                }
    
            }

        }
        
        
        in.close();

    }


}
