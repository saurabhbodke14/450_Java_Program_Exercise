import java.io.*;
public class p14 {
    public static void main(String[] args) {
        int a=56;
        int b=98,hcf;
        int result=Math.min(a,b);
        System.out.println(result);
        if((a<b) && (b<a)){
            int c=a-1;
        for(int i=c;i<0;i--){
            if(((c)%i==0)&&(b%i==0)){
                System.out.println(i);
                break;    
            }   

        }
        
        }

    }

   
}
        


    

