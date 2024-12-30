class BRunnable implements Runnable 
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name : " + t.getName() + "Thread Priority : " + t.getPriority());
        t.setPriority(3);

        Thread x = new Thread(new B1Runnable(),"B");
        x.start();
    }
}
class B1Runnable implements Runnable 
{
    public void run()
    {
        Thread t = Thread.currentThread();
        System.out.println("Thread Name : " + t.getName() + "Thread Priority : " + t.getPriority());
    }
}

class B 
{
    public static void main(String[] args) {
        Thread t = Thread.currentThread();        

        System.out.println("Thread Name : " + t.getName() + "Thread Priority : " + t.getPriority());

        Thread x = new Thread(new BRunnable(),"A");
        x.start();
    }
}


// D:\javaprac\36_multi_threading>javac B.java

// D:\javaprac\36_multi_threading>java B
// Thread Name : mainThread Priority : 5
// Thread Name : AThread Priority : 5
// Thread Name : BThread Priority : 3