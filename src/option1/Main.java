package option1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Используйте два способа для создания потоков.
        // В первом методе run() 10 раз увеличьте i=0,
        // во втором - 5 раз разделите число на 2.

        //  #1
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Увеличение i=0 10 раз");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
            }
        };
        //  #2
        Runnable runnable = new Runnable() {
            public void run() {
                double number = 20;
                System.out.println("Деление числа " + number + " 5 раз на число 2");
                for (int i = 0; i < 5; i++) {
                    number /=2;
                    System.out.println(number);
                }
            }
        };
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();
    }
}
