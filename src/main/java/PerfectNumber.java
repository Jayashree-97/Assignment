import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[]args){
        int i, sum= 0;
        Scanner scanner = new Scanner(System.in);
        int values  = scanner.nextInt();
        int k = 28;
        if(i>0){

            for(int j =1; j <= k/2; j++){
                if(j % i ==0){
                    sum = sum +i;
                }
            }
            if(sum == i){
                System.out.println(i + "is a perfect number");
            }
            else{
                System.out.println(i +" is not a perfect number");
            }
        }
        else{
            System.out.println("please enter a postive number");
        }
    }
}
