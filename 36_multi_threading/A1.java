class A1Runnable implements Runnable 
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}

class A1 
{
    public static void main(String[] args) {
        
        Thread x = new Thread(new ARunnable(),"yamraj");

        x.setPriority(Thread.MIN_PRIORITY);

        System.out.println(Thread.currentThread().getName());
    }
}

// D:\javaprac\36_multi_threading>javac A1.java

// D:\javaprac\36_multi_threading>java A1
// main
