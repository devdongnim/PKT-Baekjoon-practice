import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N= sc.nextInt();
        for(int i=1; i<10; i++){
            int multiple =i*N;
            System.out.println(N+" * "+i+" = "+multiple);
        }
        sc.close();        
    }
    
    
}