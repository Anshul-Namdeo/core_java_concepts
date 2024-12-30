class U2 
{
    public static void main(String args[])
    {
        Thread t = Thread.currentThread();

        t.setDaemon(true);
    }
}   


// D:\javaprac\36_multi_threading>javac U2.java

// D:\javaprac\36_multi_threading>java U2
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.setDaemon(Thread.java:1414)
//         at U2.main(U2.java:7)
