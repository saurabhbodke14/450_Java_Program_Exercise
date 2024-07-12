import java.util.Scanner;
public class p10 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
             fact=fact*i;
        }
        System.out.println("factorial is :"+fact);
    }
    
}
