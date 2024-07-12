import java.util.Scanner;
public class p4 {
   public static void main(String[] args) {
    float num,power;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number :");
    num=sc.nextFloat();
    power=(float)Math.pow(num,2);
    System.out.println("Power is : "+power);


   } 
}
