import java.util.Scanner;
class DigitFrequency
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int num, digit;
      int[] freq = new int[10];
      System.out.println("Enter a number");
      num = sc.nextInt();
      while(num != 0)
      {
       digit = num % 10;
       freq[digit]++;
       num /= 10;
       }
      for(int i = 0; i < 10; i++)
       if(freq[i] > 0)
        System.out.println(i + " occurs " + freq[i] + " times");
}
}
