class Y5 
{
    public static void main(String[] args) {
        
        ThreadGroup tg = new ThreadGroup("QUAD");
        Thread t1 = new Thread(tg,new XRunnable(),"Bharat");
        Thread t2 = new Thread(tg, new XRunnable(),"US");
        Thread t3 = new Thread(tg, new XRunnable(),"Australia");
        Thread t4 = new Thread(tg, new XRunnable(),"Japan");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        ThreadGroup tgp = Thread.currentThread().getThreadGroup().getParent();

        System.out.println("Default Thread's parent Thread Group : " + tgp.getName());

        tgp.list();
    }
}
class XRunnable implements Runnable 
{
    public void run()
    {
       try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
        
    }
 }

// D:\javaprac\36_multi_threading>javac Y5.java

// D:\javaprac\36_multi_threading>java Y5
// Default Thread's parent Thread Group : system
// java.lang.ThreadGroup[name=system,maxpri=10]
//     Thread[Reference Handler,10,system]
//     Thread[Finalizer,8,system]
//     Thread[Signal Dispatcher,9,system]
//     Thread[Attach Listener,5,system]
//     Thread[Notification Thread,9,system]
//     java.lang.ThreadGroup[name=main,maxpri=10]
//         Thread[main,5,main]
//         java.lang.ThreadGroup[name=QUAD,maxpri=10]
//             Thread[Bharat,5,QUAD]
//             Thread[US,5,QUAD]
//             Thread[Australia,5,QUAD]
//             Thread[Japan,5,QUAD]
//     java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
//         Thread[Common-Cleaner,8,InnocuousThreadGroup]