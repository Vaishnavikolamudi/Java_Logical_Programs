import java.util.Scanner;
class SumPrime
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, i, j, sum = 0, flag;
      System.out.println("Enter n value:");
      n = sc.nextInt();
      for(i = 2; i <= n; i++)
      {
       flag = 1;
       for(j = 2; j <= i / 2; j++)
        if(i % j == 0)
        {
         flag = 0;
         break;
        }
       if(flag == 1)
        sum += i;
      }
      System.out.println(sum);
}
}
