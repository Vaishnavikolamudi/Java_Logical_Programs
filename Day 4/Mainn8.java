import java.util.Scanner;

class Factorial {
    int fact(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }
}

class Mainn8 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        Factorial f = new Factorial();
        int result = f.fact(n);
        System.out.println("The factorial is: " + result);
        sc.close();
    }
}
