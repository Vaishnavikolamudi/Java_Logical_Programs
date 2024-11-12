import java.util.Scanner;
class Prime
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, i, flag = 1;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      if(num <= 1)
       flag = 0;
      else
       for(i = 2; i <= num / 2; i++)
        if(num % i == 0)
        {
         flag = 0;
         break;
        }
      if(flag == 1)
       System.out.println("Prime number");
      else
       System.out.println("Not a prime number");
}
}
