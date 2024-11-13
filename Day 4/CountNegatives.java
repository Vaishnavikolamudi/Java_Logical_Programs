import java.util.Scanner;
class CountNegatives
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, negativeCount = 0;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
      {
       arr[i] = sc.nextInt();
       if(arr[i] < 0)
        negativeCount++;
      }
      System.out.println("Total negative elements: " + negativeCount);
}
}
