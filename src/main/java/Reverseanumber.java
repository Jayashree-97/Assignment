import java.util.Scanner;

public class Reverseanumber {
    public static void main(String[] args){
        int n,r;
        System.out.print("Enter any number");
        Scanner scanner = new Scanner(System.in);
        n= scanner.nextInt();

        while(n>0){
            r=n%10;
            System.out.println("Reverse Order"+r);
            n=n/10;
        }
    }
}
