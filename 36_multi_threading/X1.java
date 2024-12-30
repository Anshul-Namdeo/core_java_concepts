class X1 
{
    public static void main(String args[])
    {
        Thread x = Thread.currentThread();
        ThreadGroup tg = x.getThreadGroup();

        System.out.println(x);
        System.out.println(tg);
    }
}

// D:\javaprac\36_multi_threading>javac X1.java

// D:\javaprac\36_multi_threading>java X1
// Thread[main,5,main]
// java.lang.ThreadGroup[name=main,maxpri=10]