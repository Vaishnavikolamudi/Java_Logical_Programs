import java.util.Scanner;
class Break
{
     public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      int i=1;
      for(i=1;i<=10;i++)
      {
       if(i==6)
       {
       break;
       }
       System.out.println(i);
       }
}
}