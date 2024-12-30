class Y1 
{
    public static void main(String args[])
    {
        ThreadGroup tg = new ThreadGroup("QUAD");
        ThreadGroup parentTg = tg.getParent();

        System.out.println(tg);
        System.out.println(parentTg);
    }
}


// D:\javaprac\36_multi_threading>javac Y1.java

// D:\javaprac\36_multi_threading>java Y1
// java.lang.ThreadGroup[name=QUAD,maxpri=10]
// java.lang.ThreadGroup[name=main,maxpri=10]
