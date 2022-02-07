import java.util.Scanner;

public class fibonacciseries {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        int Lastone = 1;
        int secondLast = 0;
        int sum = 0;
        System.out.println(secondLast + "\t" + Lastone);//0 1 1
        while (sum < range) {
            sum = Lastone + secondLast;
            if (sum < range) {

                System.out.print(sum + "\t");
                secondLast = Lastone;
                Lastone = sum;
            }
            else
                break;
        }

    }
}



