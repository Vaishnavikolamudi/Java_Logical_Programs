import java.util.Scanner;
class Delete
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int n, pos;
      System.out.println("Enter array size");
      n = sc.nextInt();
      int[] arr = new int[n];
      System.out.println("Enter array elements");
      for(int i = 0; i < n; i++)
       arr[i] = sc.nextInt();
      System.out.println("Enter position to delete");
      pos = sc.nextInt();
      if(pos < 1 || pos > n)
       System.out.println("Invalid position");
      else
      {
       for(int i = pos - 1; i < n - 1; i++)
        arr[i] = arr[i + 1];
       System.out.println("Array after deletion:");
       for(int i = 0; i < n - 1; i++)
        System.out.print(arr[i] + " ");
      }
}
}
