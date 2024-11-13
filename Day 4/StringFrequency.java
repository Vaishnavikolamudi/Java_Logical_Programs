import java.util.Scanner;
class StringFrequency
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string");
      String str = sc.nextLine();
      System.out.println("Enter the substring to find frequency");
      String subStr = sc.nextLine();
      int count = 0;
      int index = 0;
      while ((index = str.indexOf(subStr, index)) != -1)
      {
       count++;
       index += subStr.length();
      }
      System.out.println("Frequency of '" + subStr + "' in the string: " + count);
}
}
