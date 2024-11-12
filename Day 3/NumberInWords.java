import java.util.Scanner;
class NumberInWords
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, digit;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
      int reverse = 0;
      while(num != 0)
      {
       reverse = reverse * 10 + num % 10;
       num /= 10;
       }
      while(reverse != 0)
      {
       digit = reverse % 10;
       System.out.print(words[digit] + " ");
       reverse /= 10;
       }
}
}
