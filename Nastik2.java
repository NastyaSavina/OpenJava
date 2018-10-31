import java.util.Scanner;

public class Nastik2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        double m_kg = in.nextInt();
        double m_ml,m_gr,m_tn;    
        m_ml=m_kg*1000000;        
        m_gr=m_kg*1000;        
        m_tn=m_kg*0.001;        
        System.out.println("kg: "+m_kg);       
        System.out.println("milligramm: "+m_ml);        
        System.out.println("gramm: "+m_gr);        
        System.out.println("tonn: "+m_tn); 

        in.close();
    }
}