import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C= (B%10);
        int D= ((B/10)%10);
        int E= ((B/100)%10);
        
        System.out.println(A*C);
        System.out.println(A*D);
        System.out.println(A*E);
        System.out.println(A*B);
        
        scan.close();
    }
}