class Addition
 {
    int a, b, c;

    int add(int x, int y) 
{
        a = x;
        b = y;
        c = a + b;
        return c;  
    }
}

class Mainn3 {
    public static void main(String[] args) {
        int m = 67, n = 34, t;
        Addition a1 = new Addition();
        t = a1.add(m, n);
        System.out.println("The Addition value is: " + t);
    }
}
