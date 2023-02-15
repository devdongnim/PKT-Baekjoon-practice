import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int A=0;
        int B=0;
        for(int i=0; i<T; i++){
            A = scan.nextInt();
            B = scan.nextInt();
            System.out.println(A+B);
        }
        scan.close();
    }
}