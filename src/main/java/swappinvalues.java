public class swappinvalues {

        public static void main(String[] args) {
            int i = 50;
            int j = 80;

            System.out.println( "i = " + i + " and j = " + j);

            int temp = i;
            i = j;
            j = temp;
            System.out.println( "i = " + i + " and j = " + j);
        }
    }

