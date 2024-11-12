import java.util.Scanner;
class PrimeFactors
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, i, j, flag;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      for(i = 2; i <= num; i++)
      {
       if(num % i == 0)
       {
        flag = 1;
        for(j = 2; j <= i / 2; j++)
         if(i % j == 0)
         {
          flag = 0;
          break;
         }
        if(flag == 1)
         System.out.println(i);
       }
      }
}
}
