import java.util.Scanner;

class Factorial 
{
    void fact(int n)
 {
        int sum = 1;
        for (int i = 1; i <= n; i++)
 {
            sum = sum * i;
        }
        System.out.println("The factorial of " + n + " is: " + sum);
    }
}

class Mainn6
 {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Factorial f = new Factorial();
        f.fact(n);
        sc.close();
    }
}
