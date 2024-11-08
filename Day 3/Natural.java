import java.util.Scanner;
class Natural
{
     public static void main(String[] args)
     {
      Scanner sc=new Scanner(System.in);
      int i=1, n;
      System.out.println("Enter a number");
      n=sc.nextInt();
      while(i<=n)
      {
       System.out.println(i);
       i++;
       }
}
}