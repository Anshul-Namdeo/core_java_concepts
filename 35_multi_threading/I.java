class TThread extends Thread 
{
    public void run()
    {
        Thread t = Thread.currentThread();

        System.out.println(t);
    }
}

class I 
{
    public static void main(String[] args) {
        
        TThread a = new TThread();
        a.setName("chhotabheem");

        TThread b = new TThread();
        b.setName("raju");

        TThread c = new TThread();
        c.setName("Kaliya");

        a.start();
        b.start();
        c.start();

    }
}

// D:\javaprac\35_multi_threading>javac I.java

// D:\javaprac\35_multi_threading>java I
// Thread[chhotabheem,5,main]
// Thread[raju,5,main]
// Thread[Kaliya,5,main]