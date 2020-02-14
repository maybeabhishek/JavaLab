public class q1 {
    class Control {
        public volatile boolean flag = false;
    }

    final Control control = new Control();

    class T1 implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    while (!control.flag) {
                        System.out.println("T1 running");
                        Thread.sleep(1000);
                        control.flag = true;
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.print(e);
            }

        }
    }

    class T2 implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    while (control.flag) {
                        System.out.println("T2 running");
                        Thread.sleep(1000);
                        control.flag = false;
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.print(e);
            }

        }
    }

    private void test() {
        T1 main = new T1();
        T2 help = new T2();

        new Thread(main).start();
        new Thread(help).start();
    }

    public static void main(String[] args) throws InterruptedException {
        try {
            q1 test = new q1();
            test.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}