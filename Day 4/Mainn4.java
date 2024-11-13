class Addition
 {
    int a, b, c;
    int add() 
{
        a = 45;
        b = 22;
        c = a + b;
        return c;  
    }
}

class Mainn4 
{
    public static void main(String[] args) 
{
        int  t;
        Addition a1 = new Addition();
        t = a1.add();
        System.out.println("The Addition value is: " + t);
    }
}
