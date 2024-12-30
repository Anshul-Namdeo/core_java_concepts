class Z1
{
    public static void main(String[] args) {
        
        Thread x = new Thread();

        x.start();

        x.start();

    }
}


// D:\javaprac\33_exception_handling>javac Z1.java

// D:\javaprac\33_exception_handling>java Z1
// Exception in thread "main" java.lang.IllegalThreadStateException
//         at java.base/java.lang.Thread.start(Thread.java:802)
//         at Z1.main(Z1.java:9)