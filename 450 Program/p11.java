import java.util.Scanner;
public class p11 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        n=sc.nextInt();
        float a=((float)Math.pow(n,1));
        float b=((float)Math.pow(n,2));
        float c=((float)Math.pow(n,3));
        System.out.println(+n+" to the power 1 is "+a);
        System.out.println(+n+" to the power 2 is "+b);
        System.out.println(+n+" to the power 3 is "+c);


    }
}
