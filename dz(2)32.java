import java.util.*;

public class N333
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("vvedite bukvu ");
        int flag=0;
        char ch;
        ch = in.next().charAt(0);
        char cats[];
        cats=new char[5];
        for(int i=0;i<5;i++)
        {
            cats[i]=0;

        }
        cats[0]='a';
        cats[1]='e';
        cats[2]='o';
        cats[3]='u';
        cats[4]='i';
        for(int i=0;i<5;i++)
        {
            if(ch==cats[i])
            {
                flag++;
                if(flag==1)
                {
                    System.out.println("glasnaya ");
                }
    
            }

        }
        
        
        in.close();

    }


}