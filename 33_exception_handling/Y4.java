class Y4
{
    public static void main(String[] args) {
        
        Thread t = new Thread("zxcvbnm");

        t.setPriority(11);

            //  thread priority 1 - 10
        System.out.println(t);
    }
}



// D:\javaprac\33_exception_handling>javac Y4.java

// D:\javaprac\33_exception_handling>java Y4
// Exception in thread "main" java.lang.IllegalArgumentException
//         at java.base/java.lang.Thread.setPriority(Thread.java:1149)
//         at Y4.main(Y4.java:7)