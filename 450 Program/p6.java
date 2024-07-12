import java.util.Scanner;
import java.lang.*;
public class p6 {
public static void main(String[] args) {
    int r;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter radius :");
    r=sc.nextInt();
   double Acircle,circumference;
    Acircle=Math.PI*r*r;
    circumference=2*Math.PI*r;
    System.out.println("Area of circle is :"+Acircle);
    System.out.println("Circumference of circle is :"+circumference);


    
}
    
}
