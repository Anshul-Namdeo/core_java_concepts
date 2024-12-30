class Y3
{
    public static void main(String[] args) {
        
        Thread t = new Thread("zxcvbnm");

        t.setPriority(10);


        System.out.println(t);
    }
}


// D:\javaprac\33_exception_handling>javac Y3.java

// D:\javaprac\33_exception_handling>java Y3
// Thread[zxcvbnm,10,main]
