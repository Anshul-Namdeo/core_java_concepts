class AThread extends Thread 
{
    public void run()
    {
        Thread t = Thread.currentThread();
        for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }
    }
}



class U 
{
    public static void main(String args[])
    {
        AThread x = new AThread();
        x.setName("golu");
        x.start();

        x.setDaemon(true);
    }
}

// D:\javaprac\36_multi_threading>javac U.java

// D:\javaprac\36_multi_threading>java U
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at U.main(U.java:23)
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
// golu - 15
// golu - 16
// golu - 17
// golu - 18
// golu - 19
// golu - 20
// golu - 21
// golu - 22
// golu - 23
// golu - 24
// golu - 25
// golu - 26
// golu - 27
// golu - 28
// golu - 29