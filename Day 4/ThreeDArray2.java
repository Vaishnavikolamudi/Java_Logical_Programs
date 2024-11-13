import java.util.Scanner;
class ThreeDArray2
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int x, y, z;
      System.out.println("Enter the dimensions for 3D array (x, y, z):");
      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();
      int[][][] arr = new int[x][y][z];
      System.out.println("Enter elements for the 3D array:");
      for(int i = 0; i < x; i++)
       for(int j = 0; j < y; j++)
        for(int k = 0; k < z; k++)
         arr[i][j][k] = sc.nextInt();
      System.out.println("3D Array elements are:");
      for(int i = 0; i < x; i++)
      {
       for(int j = 0; j < y; j++)
       {
        for(int k = 0; k < z; k++)
         System.out.print(arr[i][j][k] + " ");
        System.out.println();
       }
      }
}
}
