import java.util.Scanner;
class Factorial2
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, fact = 1;
      System.out.println("Enter a number");
      num = sc.nextInt();
      for(int i = 1; i <= num; i++)
       fact *= i;
      System.out.println(fact);
}
}
