import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int king = scan.nextInt();
        int queen = scan.nextInt();
        int rook = scan.nextInt();
        int bishop = scan.nextInt();
        int knight = scan.nextInt();
        int pawn = scan.nextInt();
        
        System.out.println(1-king);
        System.out.println(1-queen);
        System.out.println(2-rook);
        System.out.println(2-bishop);
        System.out.println(2-knight);
        System.out.println(8-pawn);
        
        scan.close();
    }
}