class BThread extends Thread 
{
    public void run()
    {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            if(i == 15)
            {
                setDaemon(true);
            }
            System.out.println(t.getName() + " - " + i);
        }
    }
}

class U1 
{
    public static void main(String args[])
    {
        BThread x = new BThread();
        x.setName("golu");
        x.start();
    }
}


// D:\javaprac\36_multi_threading>javac U1.java

// D:\javaprac\36_multi_threading>java U1
// golu - 0
// golu - 1
// golu - 2
// golu - 3
// golu - 4
// golu - 5
// golu - 6
// golu - 7
// golu - 8
// golu - 9
// golu - 10
// golu - 11
// golu - 12
// golu - 13
// golu - 14
// Exception in thread "golu" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at BThread.run(U1.java:10)