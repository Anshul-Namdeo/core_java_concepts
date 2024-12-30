class NThread extends Thread 
{
    public void run() throws InterruptedException {
        Thread.sleep(3000);
        String name = Thread.currentThread().getName();
        for(int i=0; i<30; i++)
        {
            System.out.println(name + " - " + i);
        }
    }
}


class Q 
{
    public static void main(String[] args) {
        
        NThread x = new NThread();
        x.setName("Raju");
        x.start();

        String name = Thread.currentThread().getName();
        for(int i=0; i<30; i++)
        {
            System.out.println(name + " - " + i);
        }
    }
}

// D:\javaprac\35_multi_threading>javac Q.java
// Q.java:3: error: run() in NThread cannot implement run() in Runnable
//     public void run() throws InterruptedException {
//                 ^
//   overridden method does not throw InterruptedException
// 1 error