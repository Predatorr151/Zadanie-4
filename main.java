import java.util.*;
public class main
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int[]tabfb=new int[10];
        int suma=0;
        for(int i=0;i<10;i++)
        {
            System.out.println("Podaj liczbe");    
            tabfb[i]=in.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            suma=suma+tabfb[i];
        }
        System.out.println("Wynik"+suma);


    }
}
