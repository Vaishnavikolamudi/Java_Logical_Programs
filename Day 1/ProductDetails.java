import java.util.Scanner;

class ProductDetails                                                                                                                                                                                                       
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);

   int pno;
   String pname;
   float pcost,pqty,pbill;
   
   System.out.println("Enter product number");
   pno=sc.nextInt();
   System.out.println("Enter product name");
   pname=sc.next();
   System.out.println("Enter product cost");
   pcost=sc.nextInt();
   System.out.println("Enter Product quantity");
   pqty=sc.nextInt();
   
   pbill=pcost*pqty;
   System.out.println("The product bill is:"+pbill);
   }
}