import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
 
        if(M>=45){
            M=M-45;
         }else if(H>=1 && M<45){
            H=H-1;
            M=M+15;
         }else if(H==0 && M<45){
            H=23;
            M=M+15;
         }         
        System.out.println(""+H+" "+M);

        scan.close();
    }
}