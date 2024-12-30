class MyRunnable implements Runnable 
{
    public void run()
    {
        Thread x = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
            System.out.println(x.getName());
        }
    }
}


class K 
{
    public static void main(String[] args) {
        
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.setName("mohan");

        t.start();

        Thread x = Thread.currentThread();

        for(int i=0; i<30; i++)
        {
            System.out.println(x.getName());
        }
    }
}


// D:\javaprac\35_multi_threading>javac K.java

// D:\javaprac\35_multi_threading>java K
// main
// main
// main
// main
// main
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// main
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan
// mohan