import java.util.Scanner;
class Palindrome
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, reverse = 0, temp, digit;
      System.out.println("Enter a number:");
      num = sc.nextInt();
      temp = num;
      while(temp != 0)
      {
       digit = temp % 10;
       reverse = reverse * 10 + digit;
       temp /= 10;
       }
      if(num == reverse)
       System.out.println("Palindrome");
      else
       System.out.println("Not a palindrome");
}
}
