import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        int H=0;
        int M=0;
        
        if((B+C)<60){
            H=A;
            M=B+C;
         }else if((B+C)>=60){
           int x= (B+C)/60;
           int y= (B+C)%60;
            
           if(x+A>=24){
               H=x+A-24;
               M=y;
           }else{
               H=x+A;
               M=y;
           }
         }         
        System.out.println(H+" "+M);

        scan.close();
    }
}