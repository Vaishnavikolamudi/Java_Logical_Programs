class Factorial
 {
    int i, n, sum;

    void fact() 
{
        n = 5;
        i = 1;
        sum = 1;

        while (i <= n) 
{
            sum = sum * i;
            i++;
        }
        System.out.println("The factorial of " + n + " is: " + sum);
    }
}

class Mainn5 {
    public static void main(String[] args)
 {
        Factorial f = new Factorial();
        f.fact();
    }
}
