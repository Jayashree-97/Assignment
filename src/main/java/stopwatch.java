public class stopwatch {
    public static void main(String[] args) {
        long first = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread");
                }
            });
            thread.start();
            long last = System.currentTimeMillis();//1 sec = 60 milli
            System.out.println((last - first) / 60);
        }
    }
}




