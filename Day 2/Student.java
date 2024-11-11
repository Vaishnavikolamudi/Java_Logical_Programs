import java.util.Scanner;

class Student
 {
    public static void main(String[] args) 
{
        String name;
        int sno,phy, chem, bio, math, com,tot;
        float avg, percentage;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student name:");
        name = sc.next();
        System.out.println("Enter Student number:");
        sno = sc.nextInt();
        System.out.print("Enter marks for Physics: ");
        phy = sc.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        chem = sc.nextInt();
        System.out.print("Enter marks for Biology: ");
        bio = sc.nextInt();
        System.out.print("Enter marks for Mathematics: ");
        math = sc.nextInt();
        System.out.print("Enter marks for Computer: ");
        com = sc.nextInt();

       
        tot = phy + chem+ bio + math + com;
        avg=tot/3;
        percentage = (float) (tot / 500.0) * 100; 

        
        System.out.println("Total Marks: " + tot);
        System.out.println("The average is: " + avg);
        System.out.println("The Percentage is: " + percentage);

       
        if (percentage >= 90) 
{
            System.out.println("Grade: A");
        }
 else if (percentage >= 80) 
{
            System.out.println("Grade: B");
        }
 else if (percentage >= 70) {
            System.out.println("Grade: C");
        }
 else if (percentage >= 60) 
{
            System.out.println("Grade: D");
        }
 else if (percentage >= 40)
 {
            System.out.println("Grade: E");
        }
 else
 {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
