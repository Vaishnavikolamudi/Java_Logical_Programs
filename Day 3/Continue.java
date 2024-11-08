import java.util.Scanner;
class Continue
{
     public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      int i=1;
      for(i=1;i<=10;i++)
      {
       if(i==6 || i==7)
       {
       continue;
       }
       System.out.println(i);
       }
}
}