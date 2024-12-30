class Y3 
{
    public static void main(String args[])
    {
        ThreadGroup tg = Thread.currentThread().getThreadGroup();

        System.out.println("Default Thread Group : " + tg.getName());

        tg.list();
    }
}

// D:\javaprac\36_multi_threading>javac Y3.java

// D:\javaprac\36_multi_threading>java Y3
// Default Thread Group : main
// java.lang.ThreadGroup[name=main,maxpri=10]
//     Thread[main,5,main]