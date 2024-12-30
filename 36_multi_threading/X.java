class X 
{
    public static void main(String args[])
    {
        Thread x = Thread.currentThread();
        ThreadGroup tg = x.getThreadGroup();

        System.out.println("Default Thread Name : " + x.getName());
        System.out.println("Thread Group's name Of Default Thread : " + tg.getName());
    }
}


// D:\javaprac\36_multi_threading>javac X.java

// D:\javaprac\36_multi_threading>java X
// Default Thread Name : main
// Thread Group's name Of Default Thread : main
