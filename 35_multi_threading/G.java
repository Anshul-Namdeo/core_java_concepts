class YThread extends Thread 
{
    public void run()
    {
        Thread x = Thread.currentThread();

        System.out.println(x);
        System.out.println(this);
    }
}


public class G {
    public static void main(String[] args) {
        
        YThread t = new  YThread();

        t.setName("glou");

        t.run();
    }
}


// D:\javaprac\35_multi_threading>javac G.java

// D:\javaprac\35_multi_threading>java G
// Thread[main,5,main]
// Thread[glou,5,main]