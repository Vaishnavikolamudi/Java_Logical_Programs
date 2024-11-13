import java.util.Scanner;
class MatrixAddition
{
     public static void main(String[] args)
     {
      Scanner sc = new Scanner(System.in);
      int m, n;
      System.out.println("Enter number of rows and columns for the matrices:");
      m = sc.nextInt();
      n = sc.nextInt();
      int[][] matrix1 = new int[m][n];
      int[][] matrix2 = new int[m][n];
      int[][] result = new int[m][n];
      System.out.println("Enter elements of first matrix:");
      for(int i = 0; i < m; i++)
       for(int j = 0; j < n; j++)
        matrix1[i][j] = sc.nextInt();
      System.out.println("Enter elements of second matrix:");
      for(int i = 0; i < m; i++)
       for(int j = 0; j < n; j++)
        matrix2[i][j] = sc.nextInt();
      System.out.println("Addition of two matrices:");
      for(int i = 0; i < m; i++)
      {
       for(int j = 0; j < n; j++)
        result[i][j] = matrix1[i][j] + matrix2[i][j];
      }
      for(int i = 0; i < m; i++)
      {
       for(int j = 0; j < n; j++)
        System.out.print(result[i][j] + " ");
       System.out.println();
      }
}
}
