import java.util.Scanner;

public class SumOfPerfectSquare {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scan.nextInt();

        if(sumPerfectSquare(num))
            System.out.println("True");
        else 
            System.out.println("False");
    }
    public static boolean sumPerfectSquare(int num){

        for(int i = 1; i <= num / 2; i++){
            if(Math.sqrt(i) % 1 == 0 && (Math.sqrt(num - i) % 1 == 0))
                return true;
        }
        return false;
    }
}
