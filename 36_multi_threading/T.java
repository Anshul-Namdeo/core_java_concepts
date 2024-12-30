class T 
{
    public static void main(String args[])
    {
        Thread x = Thread.currentThread();

        boolean flag =  x.isDaemon();

        System.out.println(x.getName() + " IS daemon :" + flag );

    }
}

// D:\javaprac\36_multi_threading>javac T.java

// D:\javaprac\36_multi_threading>java T
// main IS daemon :false