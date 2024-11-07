import java.util.Scanner;

class StudentDetails                                                                                                                                                                                                       
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);

   int sno,m,p,c,tot;
   String sname;
   float savg;
   
   System.out.println("Enter student number");
   sno=sc.nextInt();
   System.out.println("Enter student name");
   sname=sc.next();
   System.out.println("Enter Maths subject marks");
   m=sc.nextInt();
   System.out.println("Enter Physics subject marks");
   p=sc.nextInt();
   System.out.println("Enter Chemistry subject marks");
   c=sc.nextInt();
   
   tot=m+p+c;
   savg=tot/3;
   System.out.println("The total is:"+tot);
   System.out.println("The average is:"+savg);
   }
}
   
   
   
   


   
 
