class YRunnable implements Runnable 
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
class Z 
{
    public static void main(String[] args) {
    Thread x = new Thread(new YRunnable(),"yamraj");
    x.setPriority(12);
    
    Thread t = Thread.currentThread();

    for(int i=0; i<30; i++)
        {
            System.out.println(t.getName() + " - " + i);
        }

    }
}


// D:\javaprac\35_multi_threading>javac Z.java

// D:\javaprac\35_multi_threading>java Z
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1149)
//         at Z.main(Z.java:17)