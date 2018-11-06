import java.util.Scanner;

public class dz12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        double m_kg = in.nextInt();
        double m_ml,m_gr,m_tn;    
        m_ml=m_kg*1000000;        
        m_gr=m_kg*1000;        
        m_tn=m_kg*0.001;        
        System.out.println("килограмм : "+m_kg);       
        System.out.println("миллиграмм : "+m_ml);        
        System.out.println("грамм : "+m_gr);        
        System.out.println("тонн : "+m_tn); 

        in.close();
    }
}
