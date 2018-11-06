import java.util.*;

public class pet 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int x,y,z;
        x=in.nextInt();
        y=in.nextInt();
        z=in.nextInt();
        if(((z%4==0)&&(z%100==0)&&(z%400==0))||((z%4==0)&(!(z%100==0))&(!(z%400==0))))
        {
            System.out.println("vesokosnyi god");
            den(x,y,z);
        }
        else
        {
            System.out.println("ne vesokosnyi");
            den1(x,y,z);
        }
        if(!(y==2))
        {
            if((y==1)||(y==4)||(y==6)||(y==9)||(y==11))
                     {
                        if(x>30)
                        {
                           System.out.println("vvedite drugoi den");
                           do
                           { 
                               x=in.nextInt();
                           }while(x>30);
                        }
                        if(x==30)
                         {
                            x=1;
                            y++;
                            System.out.println("sled den"+x+"/"+y+"/"+z);
                         }
                        else 
                        {
                          x++;
                          System.out.println("sled den"+x+"/"+y+"/"+z);
                        }          
                     }
        else 
            {  
                if((x==31)&&(y==12))
                {
                    x=1;
                    y=1;
                    z++;
                    System.out.println("sled den"+x+"/"+y+"/"+z);
                }
             else 
              {
                    if(x==31)
                   {
                    x=1;
                    y++;
                    System.out.println("sled den"+x+"/"+y+"/"+z);
                   }
                   else 
                   {
                      x++;
                      System.out.println("sled den"+x+"/"+y+"/"+z);
                   }    
              }      
            }
        } 
        in.close();
    }
    public static void den (int _x,int _y,int _z)
        {
            if((_x==29)&&(_y==2))
            {
                _x=1;
                _y++;
                System.out.println(_x+" "+_y+" "+_z);
            }
            if((_x>29)&&(_y==2))
            {
                System.out.println("error");
            }
            if((_x<29)&&(_y==2))
            {
                _x++;
                System.out.println(_x+" "+_y+" "+_z);
            }     
        }
        public static void den1(int _x,int _y,int _z)
        {
            if((_x==28)&&(_y==2))
            {
                _x=1;
                _y++;
                System.out.println(_x+" "+_y+" "+_z);
            }
            if((_x>28)&&(_y==2))
            {
                System.out.println("error");
            }
            if((_x<28)&&(_y==2))
            {
                _x++;
                System.out.println(_x+" "+_y+" "+_z);
            }
        }      
    }