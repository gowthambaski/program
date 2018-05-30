import java.util.*;
public class pos {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
         if(a<0)
        {
         System.out.print("negative");
         
        }
         if(a==0)
         {
             System.out.print("zero");
         }
         if(a>0)
         {
             System.out.print("positive");
         }
    }
}
