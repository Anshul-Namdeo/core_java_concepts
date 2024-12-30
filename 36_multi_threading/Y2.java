class Y2 
{
    public static void main(String args[])
    {
        ThreadGroup tg = new ThreadGroup("QUAD");
        Thread t1 = new Thread(tg,new XRunnable(),"Bharat");
        Thread t2 = new Thread(tg, new XRunnable(),"US");
        Thread t3 = new Thread(tg, new XRunnable(),"Australia");
        Thread t4 = new Thread(tg, new XRunnable(),"Japan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        tg.list();
        

    }
}

class XRunnable implements Runnable 
{
    public void run()
    {
        Thread t = Thread.currentThread();
        // for(int i=0; i<9; i++)
        // {
        //     System.out.println(t.getName() + " - " + i);
        // }
    }
}

// D:\javaprac\36_multi_threading>javac Y2.java

// D:\javaprac\36_multi_threading>java Y2
// java.lang.ThreadGroup[name=QUAD,maxpri=10]
//     Thread[Bharat,5,QUAD]
//     Thread[US,5,QUAD]
//     Thread[Australia,5,QUAD]
//     Thread[Japan,5,QUAD]
