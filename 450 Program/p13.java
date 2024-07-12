public class p13{
  public static void main(String[] args) {
    int n,m,lcm,a=1;
    n=12;
    m=9;
    for(int i=1;(i<n) && (i<m);i++){
      if((n%i==0)&&(m%i==0)){
         a=i;
        System.out.println(a);
      }
    }
    lcm=(m*n)/a;
    System.out.println("LCM is "+lcm);

  }
}