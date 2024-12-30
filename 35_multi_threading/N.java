class JThread extends Thread 
{
    public void run()
    {
        System.out.println(Thread.currentThread().isAlive());
    }
}

class N 
{
    public static void main(String[] args) {
        
        JThread x = new JThread();

        x.setName("Raju");

        x.start();
    }
}


// D:\javaprac\35_multi_threading>javac N.java

// D:\javaprac\35_multi_threading>java N
// true