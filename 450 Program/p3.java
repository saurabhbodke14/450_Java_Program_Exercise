public class p3 {
    public static void main(String[] args) {
        float principleAmount,time,rate,compundInterest,Amount;
        principleAmount=5000;
        time=2;
        rate=10;
        Amount=(float)principleAmount*((float)Math.pow((1+rate/100),time));
        compundInterest=Amount-principleAmount;
        System.out.println("Total Amount is " +Amount) ;
        System.out.println("Compound Interest is " +compundInterest);

    }
}
