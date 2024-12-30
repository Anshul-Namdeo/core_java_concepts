class Transaction implements Runnable {
    public void run() {
        Thread x = Thread.currentThread();

        for (int i = 0; i < 5; i++) {
            if (D.ac.getBalance() >= 10) {
                System.out.println(x.getName() + "is going to withdraw Rs 10");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                D.ac.withdraw(10);
                System.out.println(x.getName() + "After withdrawal .. the balance is Rs" + D.ac.getBalance());
            }
        }
    }
}

class D1 {
    static Account ac = new Account();

    public static void main(String[] args) {

        Transaction t = new Transaction();
        Thread a = new Thread(t, "mohan");
        Thread b = new Thread(t, "sohan");

        a.start();
        b.start();
    }
 }

// D:\javaprac\36_multi_threading>javac D1.java

// D:\javaprac\36_multi_threading>java D1
// sohanis going to withdraw Rs 10
// mohanis going to withdraw Rs 10
// mohanAfter withdrawal .. the balance is Rs30
// mohanis going to withdraw Rs 10
// sohanAfter withdrawal .. the balance is Rs40
// sohanis going to withdraw Rs 10
// sohanAfter withdrawal .. the balance is Rs10
// mohanAfter withdrawal .. the balance is Rs10
// mohanis going to withdraw Rs 10
// sohanis going to withdraw Rs 10
// mohanAfter withdrawal .. the balance is Rs0
// sohanAfter withdrawal .. the balance is Rs-10
