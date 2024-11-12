import java.util.Scanner;
class PowerOfNumber
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int base, exp, result = 1;
      System.out.println("Enter base and exponent");
      base = sc.nextInt();
      exp = sc.nextInt();
      for(int i = 1; i <= exp; i++)
       result *= base;
      System.out.println(result);
}
}
