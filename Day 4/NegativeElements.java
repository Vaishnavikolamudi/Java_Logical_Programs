import java.util.Scanner;
class NegativeElements
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
       arr[i] = sc.nextInt();
      System.out.println("Negative elements:");
      for(int i = 0; i < n; i++)
       if(arr[i] < 0)
        System.out.print(arr[i] + " ");
}
}
