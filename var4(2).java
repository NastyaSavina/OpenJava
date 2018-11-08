import java.util.*;

public class var42
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int n;
        int max;
        int sum=0;
        System.out.println("vvedite kol-vo elementov v massive");
        n=in.nextInt();
        int array[];
        array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=0;
        }
    
        for(int i=0;i<n;i++)
        {
            array[i]=in.nextInt();
        }
        max=array[0];
        for(int i=0;i<n;i++)
        {
            if(array[i]>=array[0])
            {
                
                max=array[i];
            }
        }
        System.out.println("macsimalny element v massive "+max);

        for(int i=0;i<n;i++)
        {
            if((array[i]>0)&&(array[i]<max))
            {
                sum+=array[i];
            }
        }
        System.out.println("summa "+sum);
        

        
        in.close();
    }
}