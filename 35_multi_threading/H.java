class ZThread extends Thread 
{
    public void run()
    {
        Thread x = Thread.currentThread();

           System.out.println(x);
    }
}
public class H {
    
    public static void main(String[] args) {
        
        ZThread t = new ZThread();

        t.setName("bablu");

        t.start();
    }
}



// D:\javaprac\35_multi_threading>javac H.java

// D:\javaprac\35_multi_threading>java H
// Thread[bablu,5,main]
